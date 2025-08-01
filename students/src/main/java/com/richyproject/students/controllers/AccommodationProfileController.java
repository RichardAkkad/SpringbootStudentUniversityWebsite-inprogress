package com.richyproject.students.controllers;

import com.richyproject.students.model.AccomodationProfile;
import com.richyproject.students.services.AccommodationProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccommodationProfileController {

    @Autowired AccommodationProfileService accommodationProfileService;

    @GetMapping("/AccommodationProfile")
    public String getAccommodationProfilePage(Model model){
        model.addAttribute("AccommodationProfile",new AccomodationProfile());//lombok/Data must of created a no args constructor or maybe doesnt need to if its the only constructor used which i think is the case

        return accommodationProfileService.AccommodationProfilePageServices();

    }

    @PostMapping("/SaveAccommodationProfile")
    public String  saveAccommodationProfile(@ModelAttribute ("AccommodationProfile") AccomodationProfile accomodationProfile, @AuthenticationPrincipal UserDetails currentUser){

        return  accommodationProfileService.AccommodationProfilePageServices(accomodationProfile, currentUser);

    }
    /*
    Project Overview This project aims to create a comprehensive web platform that enhances the university experience for all students, with particular focus on part-time and evening students (like I was myself at one point) who often miss out on traditional campus resources. The platform also provides tools for lecturers to better support their students.

The following features represent the initial development phase, with plans to incorporate additional functionality once complete as well as getting the website hosted. For Students Academic Progress Tracking -View average grades with personalized insights showing proximity to the next grade tier -Motivational feedback system to boost academic confidence

Study Group Formation -Connect with course-mates to form collaborative study groups -Facilitate meetups for discussing course material and building peer relationships -Specially designed to bridge the social gap for part-time students

Student Housing Network -Find compatible flatmates and house-sharing opportunities within the student community -Advanced filtering system to match housing preferences and lifestyle requirements -Connect students seeking shared accommodation

For Lecturers -Intuitive interface for accessing student academic records and performance data -Comprehensive student information management system -Streamlined access to essential student details

Vision The ultimate goal is to create an inclusive digital ecosystem that ensures every student—regardless of their study schedule—has access to the resources, connections, and support needed for a fulfilling university experience.
     */





}
