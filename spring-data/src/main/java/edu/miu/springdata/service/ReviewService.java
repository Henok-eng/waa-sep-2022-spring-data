package edu.miu.springdata.service;

import edu.miu.springdata.entity.Product;
import edu.miu.springdata.entity.Review;

import java.util.List;

public interface ReviewService {
    void save(Product product);
    Product getByID(int id);
    void update(int id, Product product);
    void delete(int id);
    List<Review> findAllById(int id);
}
