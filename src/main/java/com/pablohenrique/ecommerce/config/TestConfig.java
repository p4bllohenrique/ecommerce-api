package com.pablohenrique.ecommerce.config;

import com.pablohenrique.ecommerce.entities.Order;
import com.pablohenrique.ecommerce.entities.User;
import com.pablohenrique.ecommerce.repositories.OrderRepository;
import com.pablohenrique.ecommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

import static com.pablohenrique.ecommerce.OrderStatus.*;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria", "maria@gmail.com", "9999999999", "12345");
        User u2 = new User(null, "Joao", "joao@gmail.com", "8888888888", "12345");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),WAITING_PAYMENT, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),PAID, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), SHIPPED, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }

}
