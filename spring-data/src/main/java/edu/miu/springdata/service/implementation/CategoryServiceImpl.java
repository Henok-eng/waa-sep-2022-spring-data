package edu.miu.springdata.service.implementation;

import edu.miu.springdata.entity.Category;
import edu.miu.springdata.repo.CategoryRepo;
import edu.miu.springdata.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
  @Autowired
  private CategoryRepo categoryRepo;
    @Override
    public void save(Category category) {
      categoryRepo.save(category);

    }

    @Override
    public List<Category> findByName(String name) {
        return categoryRepo.findAllByname(name);

    }
}
