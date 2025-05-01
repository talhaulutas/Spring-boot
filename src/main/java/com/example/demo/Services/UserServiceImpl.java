package com.example.demo.Services;

import com.example.demo.DataTransferObject.UserResult;
import com.example.demo.Entities.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Requests.UserAddRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public UserResult addUser(UserAddRequest request){
        User user = new User();
        user.setName(request.getName());
        userRepository.save(user);
        return new UserResult().setName(user.getName());
    }
}
