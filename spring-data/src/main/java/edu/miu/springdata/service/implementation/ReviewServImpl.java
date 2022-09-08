package edu.miu.springdata.service.implementation;

import edu.miu.springdata.entity.Product;
import edu.miu.springdata.entity.Review;
import edu.miu.springdata.repo.ReviewRepo;
import edu.miu.springdata.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ReviewServImpl implements ReviewService {

    @Autowired
    private ReviewRepo reviewRepo;

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
        return reviewRepo.findAllById(id);
    }
}
