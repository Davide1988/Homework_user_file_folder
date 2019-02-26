package com.example.UserHomework.repositories;

import com.example.UserHomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
