package com.example.t2010aorderdemo.seeder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArticleSeeder {
    public void generateArtcile(){
        System.out.println("Seeding article");
    }
}
