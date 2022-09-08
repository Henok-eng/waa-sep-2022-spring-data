package edu.miu.springdata.repo;

import edu.miu.springdata.entity.Review;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepo extends CrudRepository<Review,Integer> {
    List<Review> findAllById(int id);
}
