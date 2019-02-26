package com.example.UserHomework.repositories;

import com.example.UserHomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
