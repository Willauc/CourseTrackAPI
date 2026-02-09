package com.willauc.coursetrackapi;

import com.willauc.coursetrackapi.entities.*;
import com.willauc.coursetrackapi.repositories.CategoryRepository;
import com.willauc.coursetrackapi.repositories.ProductRepository;
import com.willauc.coursetrackapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class CourseTrackApiApplication {


    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(CourseTrackApiApplication.class, args);

        var productRepository = context.getBean(ProductRepository.class);
        var categoryRepository = context.getBean(CategoryRepository.class);
        var userRepository = context.getBean(UserRepository.class);


        var user = userRepository.findById(4L)
                .orElseThrow(() -> new IllegalStateException("User not found"));

        productRepository.findAll()
                .forEach(user::addToWishlist);

        userRepository.save(user);



    }

}
