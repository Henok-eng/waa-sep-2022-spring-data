package edu.miu.springdata.entity;

import javax.persistence.*;

@Entity
public class Review {
    @Id
    private int id;
    private String comment;
    @ManyToOne
    @JoinColumn(name="owner_id")
    private User user;
}
