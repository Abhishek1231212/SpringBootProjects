package com.abhishek.learning.userservice.exceptions;

import jakarta.annotation.Resource;

public class ResourceNotFoundException extends RuntimeException{
    
    public ResourceNotFoundException(){
        super("Resource not found on server");
    }

    public ResourceNotFoundException(String msg){
        super(msg);
    }
}
