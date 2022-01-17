package com.example.school.Entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@Data
public class Student {
    @Id
    private int id;
    private String SRNo;
    private String name;
    private String standard;
    private String section;
    private String rollno;


}
