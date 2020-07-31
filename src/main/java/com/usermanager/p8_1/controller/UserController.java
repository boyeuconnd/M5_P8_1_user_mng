package com.usermanager.p8_1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @GetMapping("")
    public String getIndexPage(){
        return "index";
    }


}
