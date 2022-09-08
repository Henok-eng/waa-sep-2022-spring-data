package edu.miu.springdata.repo;

import edu.miu.springdata.entity.Category;
import edu.miu.springdata.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepo extends CrudRepository<Category, Integer> {

    List<Category> findAllByname(String name);
}
