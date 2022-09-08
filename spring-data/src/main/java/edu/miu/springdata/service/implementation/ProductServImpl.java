package edu.miu.springdata.service.implementation;

import edu.miu.springdata.entity.Category;
import edu.miu.springdata.entity.Product;
import edu.miu.springdata.repo.ProductRepo;
import edu.miu.springdata.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ProductServImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;
    @Override
    public void save(Product product) {
        productRepo.save(product);

    }

    @Override
    public Product getByID(int id) {
        return productRepo.findById(id).orElse(null);



    }

    @Override
    public void update(int id, Product productreq) {
//        Product product1= productRepo.findById(id).orElse(null);
//        if(product=null)
//            throw new NullPointerException("Id is not exist");
//        product.setName(productreq.get;
//        product1.setPrice(productreq.getPrice));
//       product.setCategory(pro)

    }

    @Override
    public void delete(int id) {
        Product product=productRepo.findById(id).orElse(null);
        productRepo.delete(product);

    }

    @Override
    public List<Product> findAllByByPriceGreaterThan(double miniprice) {
        return productRepo.findAllByByPriceGreaterThan(miniprice);
    }

    @Override
    public List<Product> findAllByByCategoryAndPriceLessThan(Category category, double maxprice) {
        return productRepo.findAllByByCategoryAndPriceLessThan(category,maxprice);
    }

    @Override
    public List<Product> findAllByNameContaining(String keyword) {

        return productRepo.findAllByNameContaining(keyword);
    }
}
