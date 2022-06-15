package com.example.relationshiphome.seeder;

import com.example.relationshiphome.entity.Order;
import com.example.relationshiphome.entity.OrderDetail;
import com.example.relationshiphome.entity.OrderDetailId;
import com.example.relationshiphome.entity.Product;
import com.example.relationshiphome.entity.enums.OrderSimpleStatus;
import com.example.relationshiphome.entity.enums.ProductSimpleStatus;
import com.example.relationshiphome.util.StringHelper;
import com.github.javafaker.Faker;
import com.example.relationshiphome.repository.OrderRepository;
import com.example.relationshiphome.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@Component
public class ApplicationSeeder implements CommandLineRunner {
    
    boolean createSeedData = false;
    final OrderRepository orderRepository;
    final ProductRepository productRepository;
    Faker faker;
    int numberOfProduct = 200;
    int numberOfOrder = 10000;

    public ApplicationSeeder(OrderRepository orderRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
        this.faker = new Faker();
    }
    @Override
    public void run(String... args) throws Exception{
        if (createSeedData){
            orderRepository.deleteAll();
            productRepository.deleteAll();
            seedProduct();
            seedOrder();
        }
    }
    private void seedOrder(){
        List<Product> products = productRepository.findAll();
        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < numberOfOrder; i++){
            Order order = new Order();
            order.setUserId("0");
            order.setId(UUID.randomUUID().toString());
            Set<OrderDetail> orderDetailSet = new HashSet<>();

            int radomOrderDetailNumber = faker.number().numberBetween(1, 5);
            HashSet<String> existingProductId = new HashSet<>();
            for (int j = 0; j < radomOrderDetailNumber; j++){
                OrderDetail orderDetail = new OrderDetail();
                Product ramdomProduct = products.get(
                        faker.number().numberBetween(0, products.size() -1)
                );
                if (existingProductId.contains(ramdomProduct.getId())){
                    continue;
                }
                existingProductId.add(ramdomProduct.getId());
                orderDetail.setId(new OrderDetailId(order.getId(), ramdomProduct.getId()));
                orderDetail.setProduct(ramdomProduct);
                orderDetail.setUnitPrice(ramdomProduct.getPrice());
                orderDetail.setQuantity(faker.number().numberBetween(1, 5));
                order.addTotalPrice(orderDetail);
                orderDetails.add(orderDetail);
            }
            order.setOrderDetails(orderDetails);
            order.setStatus(OrderSimpleStatus.DONE);
            orders.add(order);
        }
        orderRepository.saveAll(orders);
    }
    private void seedProduct(){
        List<Product> listProduct = new ArrayList<>();
        for (int i = 0; i <numberOfOrder; i++){
            System.out.println(i + 1);
                Product product = new Product();
                product.setId(UUID.randomUUID().toString());
                product.setName(faker.name().tile());
                product.setSlug(StringHelper.toSlug(product.getName()));
                product.setDescription(faker.lorem().sentence()); // text
                product.setPrice(
                        new BigDecimal(faker.number().numberBetween(100, 200) * 10000));
                product.setCreatedBy("0");
                product.setUpdatedBy("0");
                product.setDetail(faker.lorem().sentence());
                product.setThumbnails(faker.avatar().image());
                product.setStatus(ProductSimpleStatus.ACTIVE);
                listProduct.add(product);
                System.out.println(product.toString());
            }
        }

    public static void main(String[] args) {

    }
}
