package com.richyproject.students.services;

import com.richyproject.students.model.AccomodationProfile;
import com.richyproject.students.model.Student;
import com.richyproject.students.repository.AccommodationProfileRepository;
import com.richyproject.students.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class AccommodationProfileService {

    @Autowired
    AccommodationProfileRepository accommodationProfileRepository;

    @Autowired
    StudentRepository studentRepository;


    public String AccommodationProfilePageServices(){

        return "AccommodationProfilePage";

    }

    public  String AccommodationProfilePageServices(AccomodationProfile accomodationProfile, UserDetails currentUser){


        Optional<Student> student=studentRepository.findByUsername(currentUser.getUsername());
        accomodationProfile.setStudent(student.get());
        accommodationProfileRepository.save(accomodationProfile);

        return "PageSavedSuccessfully";


    }



}
