package com.geekbrains.spring.mvc.services;

import com.geekbrains.spring.mvc.model.Product;
import com.geekbrains.spring.mvc.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

    ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {this.productRepository = productRepository;}

    public List<Product> getAllProducts() {return productRepository.getProducts();}

    public Product getProduct(int id) {return productRepository.getProduct(id);}

    public void addProduct(Product product) {productRepository.addProduct(product);}

    public void removeProduct(Long id) {productRepository.removeProduct(id);}

}
