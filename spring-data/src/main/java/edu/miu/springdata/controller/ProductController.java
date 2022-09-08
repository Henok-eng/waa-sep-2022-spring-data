package edu.miu.springdata.controller;

import edu.miu.springdata.Dto.CategoryDto;
import edu.miu.springdata.Dto.ProductDto;
import edu.miu.springdata.entity.Category;
import edu.miu.springdata.entity.Product;
import edu.miu.springdata.repo.ProductRepo;
import edu.miu.springdata.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    ModelMapper modelMapper;
    ProductService productService;
    ProductController(ProductService productService){
        this.productService=productService;

    }
    @GetMapping
    public List<ProductRepo> findAll(){
        List<Product> products= productService.findAllByByCategoryAndPriceLessThan().stream().map(x,ProductDto.class));

    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getById(int id){
        Product product= productService.getByID(id);
        ProductDto productDto= modelMapper.map(product, ProductDto.class);
        return ResponseEntity.ok().body(productDto);
    }
    @PostMapping
    public ResponseEntity<?> creatProduct( @RequestBody ProductDto productDto){
        Product product= modelMapper.map(productDto,Product.class);
        productService.save(product);
        return  new ResponseEntity<ProductDto>(productDto, HttpStatus.OK);

    }
    @DeleteMapping
    public void deleteProduct(@PathVariable int id){
        productService.delete(id);

        }
        @GetMapping
        public ResponseEntity<List<ProductDto>> findAllByByPriceGreaterThan(@RequestParam double miniprice){
        List<ProductDto> productDtos= productService.findAllByByPriceGreaterThan(miniprice)
                .stream().map(x->modelMapper.map(x,ProductDto.class)).collect(Collectors.toList());
        return ResponseEntity.ok().body(productDtos);

    }
    @GetMapping("")
    public ResponseEntity<List<ProductDto>> findAllByByCategoryAndPriceLessThan(CategoryDto categoryDto, double maxprice){
        Category category= modelMapper.map(categoryDto,Category.class);
        List<Product> products=productService.findAllByByCategoryAndPriceLessThan(category,maxprice);
        List<ProductDto> productDtos=products.stream().map(x->modelMapper.map(x,ProductDto.class)).collect(Collectors.toList());
        return  ResponseEntity.ok().body(productDtos);
    }
    @GetMapping
    public  ResponseEntity<List<ProductDto>> findAllByNameContaining(@PathVariable String keyword){
        List<ProductDto> productDtos= productService.findAllByNameContaining();

    }
}
