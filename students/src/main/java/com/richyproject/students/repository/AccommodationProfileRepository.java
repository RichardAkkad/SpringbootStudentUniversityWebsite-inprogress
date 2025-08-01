package com.richyproject.students.repository;

import com.richyproject.students.model.AccomodationProfile;
import com.richyproject.students.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccommodationProfileRepository extends JpaRepository<AccomodationProfile,Integer> {






}
