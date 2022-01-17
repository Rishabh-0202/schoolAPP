package com.example.school.Entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "teacher")
@Data
public class Teacher {

    @Id
    private int id;
    private int employeeid;
    private String name;
    private int attendence;
    private Date dateofjoining;

}
