package com.dio.santander_2025.service;

import com.dio.santander_2025.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService {


    User findById(Long id);

    User create(User userToCreate);
}
