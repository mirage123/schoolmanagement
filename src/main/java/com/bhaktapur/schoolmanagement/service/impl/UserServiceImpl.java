package com.bhaktapur.schoolmanagement.service.impl;

import com.bhaktapur.schoolmanagement.entities.User;
import com.bhaktapur.schoolmanagement.repositories.UserRepository;
import com.bhaktapur.schoolmanagement.reqres.UserCreateRequest;
import com.bhaktapur.schoolmanagement.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Long create(UserCreateRequest userCreateRequest) {
        User user = User.builder()
                .firstName(userCreateRequest.getFirstName())
                .lastName(userCreateRequest.getLastName())
                .address(userCreateRequest.getAddress())
                .username(userCreateRequest.getUsername())
                .password(userCreateRequest.getPassword())
                .role("ADMIN")
                .build();


        return this.userRepository.save(user).getId();

    }
}
