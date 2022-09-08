package edu.miu.springdata.service;

import edu.miu.springdata.entity.Category;
import edu.miu.springdata.entity.Product;

import java.util.List;

public interface ProductService {
    void save(Product product);
    Product getByID(int id);
    void update(int id, Product product);
    void delete(int id);
    List<Product> findAllByByPriceGreaterThan(double miniprice);
    List<Product> findAllByByCategoryAndPriceLessThan(Category category,double maxprice);
    List<Product>  findAllByNameContaining(String name);
}
