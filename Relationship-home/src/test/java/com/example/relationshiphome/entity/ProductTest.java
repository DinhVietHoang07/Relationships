package com.example.relationshiphome.entity;

import com.example.relationshiphome.entity.enums.ProductStatus;
import com.example.relationshiphome.entity.enums.ProductStatus;
import org.junit.jupiter.api.Test;

class ProductTest {
    @Test
    public void checkProductStatus(){
        System.out.println(ProductStatus.of(-1));
    }
}