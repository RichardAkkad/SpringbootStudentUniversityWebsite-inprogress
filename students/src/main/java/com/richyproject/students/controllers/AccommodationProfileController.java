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






}

