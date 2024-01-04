package com.example.Darna.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Darna.dao.entities.operation;

public interface operationRepository extends JpaRepository<operation,Long> {
    
}