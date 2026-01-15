package com.github.CaicoSantos1998.Found.It.config;

import com.github.CaicoSantos1998.Found.It.entities.Order;
import com.github.CaicoSantos1998.Found.It.entities.User;
import com.github.CaicoSantos1998.Found.It.entities.enums.OrderStatus;
import com.github.CaicoSantos1998.Found.It.repositories.OrderRepository;
import com.github.CaicoSantos1998.Found.It.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98837421", "12452");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "98873221", "432222");

        Order o1 = new Order(null, Instant.parse("2025-01-15T13:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2025-01-14T17:05:37Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2025-01-13T10:29:17Z"), OrderStatus.WAITING_PAYMENT, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
