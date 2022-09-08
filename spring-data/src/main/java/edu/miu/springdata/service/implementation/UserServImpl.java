package edu.miu.springdata.service.implementation;

import edu.miu.springdata.entity.Product;
import edu.miu.springdata.entity.Review;
import edu.miu.springdata.repo.UserRepo;
import edu.miu.springdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserServImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public void save(Product product) {

    }

    @Override
    public Product getByID(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Review> findAllById(int id) {
        return null;
    }
}
