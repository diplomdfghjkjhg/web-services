package com.example.authservice.controller;

import com.example.authservice.entity.RegistrationRequest;
import com.example.authservice.service.RegistrationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registration")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Slf4j
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/")
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }
}
