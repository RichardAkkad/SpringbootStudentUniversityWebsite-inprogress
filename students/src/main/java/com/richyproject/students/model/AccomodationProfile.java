package com.richyproject.students.model;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.persistence.Id;  //  CORRECT - This is for JPA
@Entity
@Data

public class AccomodationProfile {


    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int id;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Column(name="smoker")
    private String smoker;
    private double minBudget;
    private double maxBudget;
    private String hasPets;
    private String myGender;
    private String dietaryPattern;
    private String overnightGuests;
    private int age;







}
