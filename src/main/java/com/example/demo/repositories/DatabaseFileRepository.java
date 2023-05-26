package com.example.demo.repositories;

import com.example.demo.models.DatabaseFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DatabaseFileRepository extends JpaRepository<DatabaseFile, Long> {
    List<DatabaseFile> findByFileNameContaining(String searchTerm);
}
