package com.eurekaclient.frontserver.controller;

import com.eurekaclient.frontserver.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/eureka-client")
public class BasicController {

    @GetMapping(value="/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getUserDetails(@PathVariable("userId") String userId){
        User user = new User();
        user.setId(userId);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }
}
