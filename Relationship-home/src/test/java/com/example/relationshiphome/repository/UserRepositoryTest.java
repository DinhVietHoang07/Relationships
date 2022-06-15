package com.example.relationshiphome.repository;

import com.example.relationshiphome.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    //save user junit test
    @Test
    public void saveUser(){
        User user = User.builder()
                .userId("U01")
                .username("ngodat2002")
                .password("****")
                .fullName("Ngo Chi Thanh Dat")
                .address("Bac Ninh")
                .phone("03829572")
        .build();
        userRepository.save(user);
    }
}