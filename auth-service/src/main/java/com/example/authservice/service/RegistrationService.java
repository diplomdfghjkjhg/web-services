package com.example.authservice.service;

import com.example.authservice.entity.RegistrationRequest;
import com.example.authservice.entity.User;
import com.example.authservice.entity.UserRole;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    @Autowired
    private UserService userService;

    public String register(RegistrationRequest request) {

        return userService.signUpUser(new User(
                request.getFirstName(),
                request.getLastName(),
                request.getEmail(),
                request.getPassword(),
                UserRole.USER
        ));
    }
}
