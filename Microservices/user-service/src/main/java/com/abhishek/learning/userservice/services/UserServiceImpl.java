package com.abhishek.learning.userservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhishek.learning.userservice.exceptions.ResourceNotFoundException;
import com.abhishek.learning.userservice.models.User;
import com.abhishek.learning.userservice.repositories.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    // @Autowired
    // private ObjectMapper mapper; 

    // private ObjectWriter objectWriter = mapper.writer();

    
    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }


    @Override
    public User getUserById(long id){
      return userRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("No Resource"));
    }

    @Override
    public User saveUser(User user) {
       return userRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty())
            throw new ResourceNotFoundException("Not Found");
        else
            userRepository.delete(user.get());
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }
    
}