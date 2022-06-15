package com.example.relationshiphome.seeder;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

class ApplicationSeederTest {

    @Test
    public void testFaker(){
        Faker faker = new Faker();
        for (int i = 0; i < 100; i++) {
            System.out.println(faker.address().country());
        }
    }
}