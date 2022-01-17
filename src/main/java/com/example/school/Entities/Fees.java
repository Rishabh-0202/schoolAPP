package com.example.school.Entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "fees")
@Data
public class Fees {

    @Id
    private int id;
    private String srno;
    private String name;
    private Date dateofdeposition;
    private Date dateofupcomingfees;

}
