package com.example.relationshiphome.repository;

import com.example.relationshiphome.entity.Product;
import com.example.relationshiphome.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    //save product junit test
    @Test
    public void saveProduct(){
        Product product = Product.builder()
                .productId("P01")
                .name("Nike")
                .slug("nike-dep-tuyet")
                .description("Nike la mot giay that dep")
                .status(1)
                .build();
        productRepository.save(product);
    }
}