package com.ssdi.project.medicineManagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ssdi.project.medicineManagement.model.User;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Integer> {

}
