package edu.miu.springdata.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "my_user")
public class User {
    @Id
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    @JoinColumn(name="review")
    @OneToMany(mappedBy = "review")
    private List<Review> reviewList;
    @OneToOne
    private Address address;
}
