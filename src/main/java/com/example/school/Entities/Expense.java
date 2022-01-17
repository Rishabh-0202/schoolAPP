package com.example.school.Entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="expense")
@Data
public class Expense {

    @Id
    private int id;
    private String expense;
    private Date dateodexpense;

}
