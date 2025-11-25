package com.pablohenrique.ecommerce.config;

import com.pablohenrique.ecommerce.entities.User;
import com.pablohenrique.ecommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria", "maria@gmail.com", "9999999999", "12345");
        User u2 = new User(null, "Joao", "joao@gmail.com", "8888888888", "12345");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
