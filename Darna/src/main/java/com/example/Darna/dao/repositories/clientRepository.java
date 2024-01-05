package com.example.Darna.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Darna.dao.entities.Client;


@Repository
public interface clientRepository extends JpaRepository<Client,Long>{
    
}