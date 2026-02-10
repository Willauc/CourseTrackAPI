package com.willauc.coursetrackapi.Services;


import com.willauc.coursetrackapi.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class UsersServices {
    private final UserRepository userRepository;

    @Transactional
    public void findByLoyaltyPoints(int points) {
        var users = userRepository.findLoyalUsers(points);

        users.forEach(p -> System.out.println(p.getId() + ": " + p.getEmail()));


    }
}
