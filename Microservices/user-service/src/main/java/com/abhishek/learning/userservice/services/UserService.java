package com.abhishek.learning.userservice.services;

import java.util.List;

import com.abhishek.learning.userservice.models.User;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface UserService {


    List<User> getUsers();

    User getUserById(long id);

    User saveUser(User user);

    void deleteUser(long id);

    User updateUser(User user);



}
