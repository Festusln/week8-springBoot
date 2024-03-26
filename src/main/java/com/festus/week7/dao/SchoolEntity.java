package com.festus.week7.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class SchoolEntity {

    @GeneratedValue
    @Id
    private long id;
    private String name;
    private String address;
    private int numOfDept;
    private int numOfStaff;
}
