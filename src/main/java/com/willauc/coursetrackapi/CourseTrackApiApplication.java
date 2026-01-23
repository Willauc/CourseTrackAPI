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
        var manager = context.getBean(NotificationManager.class);
        manager.sendNotification("allo");
    }

}
