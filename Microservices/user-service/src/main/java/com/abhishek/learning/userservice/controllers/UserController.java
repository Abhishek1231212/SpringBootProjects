package com.abhishek.learning.userservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.learning.userservice.models.User;
import com.abhishek.learning.userservice.services.UserService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/")
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping(value="users")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUsers());
    }

    @GetMapping(value="users/{user_id}")
    public ResponseEntity<User> getUserById(@PathVariable long user_id) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUserById(user_id));
    }

    @PostMapping(value="users")
    public ResponseEntity<User> addUsers(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.saveUser(user));
    }
    
    @DeleteMapping(value="users/{user_id}")
    public void deleteUserById(@PathVariable long user_id) {
        userService.deleteUser(user_id);
    }

    @PutMapping(value="users")
    public ResponseEntity<User> updateUsers(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.updateUser(user));
    }

}
