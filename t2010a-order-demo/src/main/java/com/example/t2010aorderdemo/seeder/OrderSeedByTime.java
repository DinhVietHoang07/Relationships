package com.example.t2010aorderdemo.seeder;

import com.example.t2010aorderdemo.entity.enums.OrderSimpleStatus;
import lombok.*;

import java.time.Month;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderSeedByTime {
   
    private OrderSeedByTimeType seedTypeByTime;
    private int year; 
    private Month month;
    private int day;
    private int orderCount; 
    private OrderSimpleStatus orderStatus; 
}
