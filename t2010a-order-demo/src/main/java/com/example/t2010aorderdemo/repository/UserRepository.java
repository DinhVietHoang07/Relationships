package com.example.t2010aorderdemo.repository;

import com.example.t2010aorderdemo.entity.Product;
import com.example.t2010aorderdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
