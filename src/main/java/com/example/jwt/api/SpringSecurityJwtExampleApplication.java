package com.example.jwt.api;

import com.example.jwt.api.entity.User;
import com.example.jwt.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void initUsers(){
        List<User> users = Stream.of(
                new User(101,"sandun","1234","sandun@gmail.com")
        ).collect(Collectors.toList());
        userRepository.saveAll(users);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
    }

}
