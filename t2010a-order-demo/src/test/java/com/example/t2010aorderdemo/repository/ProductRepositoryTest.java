package com.example.t2010aorderdemo.repository;

import com.example.t2010aorderdemo.T2010aOrderDemoApplication;
import com.example.t2010aorderdemo.entity.Product;
import com.example.t2010aorderdemo.entity.enums.ProductSimpleStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {T2010aOrderDemoApplication.class})
class ProductRepositoryTest {
    @Autowired
    private  ProductRepository productRepository;

    @Test
    public void testSaveProduct(){
        Product product = Product.builder()
                .id(UUID.randomUUID().toString())
                .name("Product 01")
                .detail("Detail 01")
                .thumbnails("anh.png")
                .price(new BigDecimal(02100))
                .status(ProductSimpleStatus.ACTIVE)
                .build();
        productRepository.save(product);
    }
}