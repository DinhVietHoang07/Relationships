package com.example.relationshiphome.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "users")
public class User {
    @Id
    private String userId;
    private String username;
    private String password;
    private String fullName;
    private String address;
    private String phone;
}
