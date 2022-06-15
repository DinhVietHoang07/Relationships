package com.example.relationshiphome.repository;

import com.example.relationshiphome.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
