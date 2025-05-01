package com.example.demo.Services;

import com.example.demo.DataTransferObject.UserResult;
import com.example.demo.Requests.UserAddRequest;

public interface UserService {
    UserResult addUser(UserAddRequest request);
}
