package com.willauc.coursetrackapi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CourseTrackApiApplication {


    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(CourseTrackApiApplication.class, args);

        var userService = context.getBean(UserService.class);

        User userToAdd = new User(123L, "will", "auc", "tzar@hot.com", "******");
        userService.registerUser(userToAdd);
        userService.registerUser(userToAdd);

    }

}
