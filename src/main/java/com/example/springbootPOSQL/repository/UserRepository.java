package com.example.springbootPOSQL.repository;

import com.example.springbootPOSQL.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
