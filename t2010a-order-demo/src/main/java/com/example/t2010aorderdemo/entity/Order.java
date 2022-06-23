package com.example.t2010aorderdemo.entity;

import com.example.t2010aorderdemo.entity.base.BaseEntity;
import com.example.t2010aorderdemo.entity.enums.OrderSimpleStatus;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@ToString
@Entity
@Table(name = "orders")
@MappedSuperclass
public class Order extends BaseEntity {
    @Id
    private String id;
    private String userId;//0
    private BigDecimal totalPrice;
    @Enumerated(EnumType.ORDINAL)
    private OrderSimpleStatus status;

    public void calculateTotalPrice() {
    }

    public void setOrderDetails(Set<OrderDetail> orderDetails) {
    }
}
