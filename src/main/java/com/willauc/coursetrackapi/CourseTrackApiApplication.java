package com.willauc.coursetrackapi;

import com.willauc.coursetrackapi.Services.UsersServices;
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
        var service = context.getBean(UsersServices.class);

        service.findByLoyaltyPoints(2);





    }

}
