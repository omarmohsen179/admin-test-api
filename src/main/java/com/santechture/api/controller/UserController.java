package com.santechture.api.controller;


import com.santechture.api.dto.GeneralResponse;
import com.santechture.api.entity.User;
import com.santechture.api.exception.BusinessExceptions;
import com.santechture.api.service.UserService;
import com.santechture.api.validation.AddUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping("/add")
    public ResponseEntity<GeneralResponse> addUser(@RequestBody AddUserRequest user) throws BusinessExceptions {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        System.out.println("Current logged in user: " + currentPrincipalName);
        return userService.addNewUser(user);
    }
}
