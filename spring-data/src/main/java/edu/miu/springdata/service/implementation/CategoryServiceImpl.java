package edu.miu.springdata.service.implementation;

import edu.miu.springdata.entity.Category;
import edu.miu.springdata.repo.CategoryRepo;
import edu.miu.springdata.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CategoryServiceImpl implements CategoryService {
  @Autowired
  private CategoryRepo categoryRepo;

  @Override
  public void save(Category category) {
    categoryRepo.save(category);
  }

  @Override
  public Category getByID(int id) {
    return null;
  }

  @Override
  public void update(int id, Category category) {


  }

  @Override
  public void delete(int id) {

  }

  @Override
  public List<Category> findAll() {
    return null;
  }

  @Override
    public List<Category> findByName(String name) {
        return categoryRepo.findAllByname(name);

    }
}
