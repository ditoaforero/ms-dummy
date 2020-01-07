package com.stratio.dummy.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DummyController {


    @GetMapping("/test")
    public String getEmployees(){

        return "This is a test";
    }
}
