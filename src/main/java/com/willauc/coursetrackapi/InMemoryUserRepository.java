package com.willauc.coursetrackapi;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class InMemoryUserRepository implements UserRopository{
    HashMap<String, User> users;

    public InMemoryUserRepository() {
        this.users = new HashMap<>();
    }

    @Override
    public void save(User user) {
        users.put(user.getEmail(), user);
    }
}
