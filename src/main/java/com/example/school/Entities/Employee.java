package com.example.school.Entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "employee")
@Data
public class Employee {
    @Id
    private int id;
    private int employeeid;
    private String name;
    private Date dateofjoining;
    private double salary;
    private Date dateofsalary;
}
