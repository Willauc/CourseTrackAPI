package com.willauc.coursetrackapi;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService {
    @Value("${email-notification-service.host}")
    private String host;
    @Value("${email-notification-service.port}")
    private String port;


    @Override
    public void sendNotification(String message, String email) {
        System.out.println("Email Notification Service");
        System.out.println("Email Send to " + email + " : " + message);
        System.out.println("using host " + host + " and port " + port);
    }
    

}
