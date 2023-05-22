package com.bhaktapur.schoolmanagement.service;

import com.bhaktapur.schoolmanagement.reqres.UserCreateRequest;

public interface UserService {
    Long create(UserCreateRequest userCreateRequest);

}
