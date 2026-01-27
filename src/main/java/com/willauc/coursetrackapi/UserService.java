package com.willauc.coursetrackapi;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRopository userRopository;
    private final NotificationService notificationService;

    public UserService(UserRopository userRopository, NotificationService notificationService) {
        this.userRopository = userRopository;
        this.notificationService = notificationService;
    }

    public void registerUser(User user) {
        String message;

        if (!userRopository.save(user)){
            message = "User :" + user.toString() + " is already registered.";
        }else{message = "User :" + user.toString() + " has been registered successfully.";}
        notificationService.sendNotification(message, user.getEmail());
    }
}
