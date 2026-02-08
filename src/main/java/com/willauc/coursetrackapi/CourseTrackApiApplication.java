package com.willauc.coursetrackapi;

import com.willauc.coursetrackapi.entities.Address;
import com.willauc.coursetrackapi.entities.Profile;
import com.willauc.coursetrackapi.entities.User;
import com.willauc.coursetrackapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CourseTrackApiApplication {


    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(CourseTrackApiApplication.class, args);

        var repository = context.getBean(UserRepository.class);

        repository.deleteById(3L);
    }

}
