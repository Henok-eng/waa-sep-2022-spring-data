package edu.miu.springdata.Dto;

import javax.persistence.Id;

public class ProductDto {
    @Id
    private int id;
    private String name;
}
