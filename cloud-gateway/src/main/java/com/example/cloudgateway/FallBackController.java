package com.example.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/stockServiceFallBack")
    public String stockServiceFallBack() {
        return "Something wrong with stock services. Try again";
    }
}
