package com.willauc.coursetrackapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${SMSNotification}")
    private Boolean SMSNotification;

    @Bean
    public NotificationService SMS() {
        return new SMSNotificationService();
    }

    @Bean
    public NotificationService Email() {
        return new EmailNotificationService();
    }

    @Bean
    public NotificationManager notificationManager() {
        if (SMSNotification) {return new NotificationManager(SMS());}
        return new NotificationManager(Email());
    }
}
