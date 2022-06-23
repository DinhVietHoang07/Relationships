package com.example.t2010aorderdemo.repository;

import com.example.t2010aorderdemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
