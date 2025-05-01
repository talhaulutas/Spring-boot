package com.example.demo.Services;

import com.example.demo.DataTransferObject.UserResult;
import com.example.demo.Requests.UserAddRequest;

import java.util.List;

public interface UserService {
    UserResult addUser(UserAddRequest request);

    List<UserResult> getUsers();
}
