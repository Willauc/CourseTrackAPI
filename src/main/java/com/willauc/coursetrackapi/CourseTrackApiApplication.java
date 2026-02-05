package com.willauc.coursetrackapi;

import com.willauc.coursetrackapi.entities.Address;
import com.willauc.coursetrackapi.entities.Profile;
import com.willauc.coursetrackapi.entities.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CourseTrackApiApplication {


    public static void main(String[] args) {

        //ApplicationContext context = SpringApplication.run(CourseTrackApiApplication.class, args);

        var user = User.builder()
                .name("Roxe")
                .password("allo")
                .email("allo@hotgirl.com")
                .build();

        var address = Address.builder()
                .street("dsd")
                .city("dss")
                .zip("12345")
                .state("state").build();

        user.addTag("Tag1");
        user.addAdress(address);

        var profile = Profile.builder()
                        .bio("bio").build();

        user.addProfile(profile);

        System.out.println(user);
    }

}
