package com.example.authservice.service;

import com.example.authservice.entity.RegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public String register(RegistrationRequest request) {
        return "ok ok";
    }
}
