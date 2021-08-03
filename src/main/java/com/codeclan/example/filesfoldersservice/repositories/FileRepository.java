package com.codeclan.example.filesfoldersservice.repositories;

import com.codeclan.example.filesfoldersservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
