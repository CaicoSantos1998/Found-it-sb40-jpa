package com.github.CaicoSantos1998.Found.It.config;

import com.github.CaicoSantos1998.Found.It.entities.User;
import com.github.CaicoSantos1998.Found.It.repositories.UserRepository;
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
        User u1 = ncew User(null, "Maria Brown", "maria@gmail.com", "98837421", "12452");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "98873221", "432222");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
