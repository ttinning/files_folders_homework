package com.codeclan.example.filesfoldersservice.repositories;

import com.codeclan.example.filesfoldersservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
