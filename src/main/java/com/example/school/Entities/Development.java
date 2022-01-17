package com.example.school.Entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "development")
@Data
public class Development {

    @Id
    private int id;
    private String expensename;
    private double funds;
    private double expense;
    private double fundsAvailable;

}
