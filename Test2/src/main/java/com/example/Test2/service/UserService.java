package com.example.Test2.service;

import com.example.Test2.model.UserDto;
import com.example.Test2.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto getUserById(Integer id) {
        return this.userRepository.findById(id);
    }
}
