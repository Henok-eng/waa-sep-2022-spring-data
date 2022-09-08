package edu.miu.springdata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
    @Id
    private int id;
    private String Street;
    private String zip;
    private String city;
    @OneToOne
    private User user;
}
