package com.example.t2010aorderdemo.entity;

import com.example.t2010aorderdemo.entity.base.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "users")
public class User extends BaseEntity {
    @Id
    private String userId;
    private String username;

}
