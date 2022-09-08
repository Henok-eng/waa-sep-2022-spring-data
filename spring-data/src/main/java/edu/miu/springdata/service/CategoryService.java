package edu.miu.springdata.service;

import edu.miu.springdata.entity.Address;
import edu.miu.springdata.entity.Category;

import java.util.List;

public interface CategoryService {
    void save(Category address);
    Category getByID(int id);
    void update(int id, Category category);
    void delete(int id);
    List<Category> findAll();
    List<Category> findByName(String name);
}
