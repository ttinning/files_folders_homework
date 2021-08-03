package com.codeclan.example.filesfoldersservice.repositories;

import com.codeclan.example.filesfoldersservice.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
