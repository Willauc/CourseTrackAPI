package com.willauc.coursetrackapi.repositories;

import com.willauc.coursetrackapi.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}