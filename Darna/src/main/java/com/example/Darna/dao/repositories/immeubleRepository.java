package com.example.Darna.dao.repositories;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Darna.dao.entities.immeuble;
@Repository
public interface immeubleRepository  extends JpaRepository<immeuble,Long>{
    Optional<immeuble>findByCode(String code);
    List<immeuble>findByCategoryId(Long id);
    
}