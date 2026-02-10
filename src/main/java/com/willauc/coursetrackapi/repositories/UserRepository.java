package com.willauc.coursetrackapi.repositories;

import com.willauc.coursetrackapi.dtos.UserSummary;
import com.willauc.coursetrackapi.entities.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query("select u.id as id, u.email as email from User u where u.profile.loyaltyPoint > :loyaltyPoints order by u.email")
    List<UserSummary> findLoyalUsers(@Param("loyaltyPoints") int loyaltyPoints);

}
