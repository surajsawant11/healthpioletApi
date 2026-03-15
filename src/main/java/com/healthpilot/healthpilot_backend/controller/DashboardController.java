package com.healthpilot.healthpilot_backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dash")
public class DashboardController {

    @GetMapping("/test")
    public String Test(){
        return "testing ";
    }

}
