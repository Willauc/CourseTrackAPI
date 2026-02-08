package com.willauc.coursetrackapi.repositories;

import com.willauc.coursetrackapi.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
