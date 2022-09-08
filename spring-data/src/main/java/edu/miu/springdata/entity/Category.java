package edu.miu.springdata.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="my_category")
public class Category {
    @Id
    private int id;
    @Column(name="category_Name")
    private String name;
   @OneToMany(mappedBy = "category")
    private List<Product> productList;
}
