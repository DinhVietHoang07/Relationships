package com.example.relationshiphome.repository;

import com.example.relationshiphome.entity.Order;
import com.example.relationshiphome.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class OrderRepositoryTest {
    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void saveOrder(){
        User user = new User();

        Order order = Order.builder()
                .orderId("O01")
                .user(User.builder().build())
                .totalPrice(11.56)
                .status(1)
                .build();
        orderRepository.save(order);
    }
}