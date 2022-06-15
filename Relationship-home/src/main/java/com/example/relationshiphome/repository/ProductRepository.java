package com.example.relationshiphome.repository;

import com.example.relationshiphome.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}
