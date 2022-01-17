package com.example.school.Entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="library")
@Data
public class Library {
    @Id
    private int id;
    private int bookId;
    private String bookName;
    private Date dateofPurchase;
    private Date dateOfIssue;

}
