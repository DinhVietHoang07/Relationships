package com.example.t2010aorderdemo.repository;

import com.example.t2010aorderdemo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository
        extends JpaRepository<Order, String>, JpaSpecificationExecutor<Order> {

}
