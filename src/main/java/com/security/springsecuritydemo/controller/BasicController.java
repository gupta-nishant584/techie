package com.security.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/")
    public String welcome(){
        return "<h1>Welcome</h1>";
    }

    @RequestMapping(value ="/admin", method = RequestMethod.GET)
    public String admin(){
       return "<h1>Welcome Admin</h1>";
    }

    @RequestMapping(value ="/user", method = RequestMethod.GET)
    public String user(){
        return "<h1>Hello User</h1>";
    }
}
