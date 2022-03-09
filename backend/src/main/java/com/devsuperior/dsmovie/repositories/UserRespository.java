package com.devsuperior.dsmovie.repositories;

import com.devsuperior.dsmovie.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Long> {  
  
  User findByEmail(String email);
}
