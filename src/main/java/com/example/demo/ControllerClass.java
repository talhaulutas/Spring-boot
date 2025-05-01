package com.example.demo;
import com.example.demo.DataTransferObject.UserResult;
import com.example.demo.Requests.UserAddRequest;
import com.example.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerClass {
    @Autowired
    UserService userService;

    @PostMapping("addUser")
    public UserResult addUser(@RequestBody UserAddRequest request){
        return userService.addUser(request);
    }

    @GetMapping("getUsers")
    public List<UserResult> getUsers(){
        return userService.getUsers();
    }
}
