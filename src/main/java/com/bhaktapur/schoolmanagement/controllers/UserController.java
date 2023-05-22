package com.bhaktapur.schoolmanagement.controllers;

import com.bhaktapur.schoolmanagement.reqres.UserCreateRequest;
import com.bhaktapur.schoolmanagement.service.UserService;
import com.bhaktapur.schoolmanagement.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public Long create(@RequestBody UserCreateRequest userCreateRequest){

        return this.userService.create(userCreateRequest);
    }
}
