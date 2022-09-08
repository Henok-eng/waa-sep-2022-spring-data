package edu.miu.springdata.repo;

import edu.miu.springdata.entity.Category;
import edu.miu.springdata.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Integer> {

    List<Product> findAllByByPriceGreaterThan(double miniprice);
    List<Product> findAllByByCategoryAndPriceLessThan(Category category,double maxprice);
    List<Product>  findAllByNameContaining(String name);

}
