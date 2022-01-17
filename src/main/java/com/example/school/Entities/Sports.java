package com.example.school.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sports")
public class Sports {

    @Id
    private int id;
    private double fundsAvailable;
    private double expenses;

}
