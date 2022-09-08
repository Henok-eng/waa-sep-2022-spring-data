package edu.miu.springdata.entity;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private double price;
    private String rating;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
}
