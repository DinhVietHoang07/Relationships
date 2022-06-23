package com.example.t2010aorderdemo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import java.math.BigDecimal;

public class OrderDetail {
    @EmbeddedId
    private OrderDetailId id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false)
    @JsonBackReference
    private Order order;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
    @JsonBackReference
    private Product product;
    // thông tin thêm.
    private Integer quantity;
    private BigDecimal unitPrice; // tl; dr;


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setOrder(Order order) {
    }

    public void setId(OrderDetailId orderDetailId) {
    }

    public void setProduct(Product product) {
    }

    public void setUnitPrice(BigDecimal price) {
    }
}
