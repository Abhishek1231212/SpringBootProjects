package com.abhishek.learning.userservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.abhishek.learning.userservice.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
