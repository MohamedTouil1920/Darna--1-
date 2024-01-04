package com.example.Darna.business.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Darna.business.services.immeubleservices;
import com.example.Darna.dao.entities.immeuble;
import com.example.Darna.dao.repositories.immeubleRepository;
import com.example.Darna.dao.repositories.operationRepository;

@Service
public class immeubleservicesImpl implements immeubleservices {
  @Autowired
  immeubleRepository immeubleRepository;

  @Override
  public Optional<immeuble> getimmeuble(Long id) {
    return immeubleRepository.findById(id);
  }

  @Override
  public Optional<immeuble> getimmeubleByCode(String code) {
    return immeubleRepository.findByCode(code);
  }

  @Override
  public immeuble addimmeuble(immeuble I) {
    return immeubleRepository.save(I);
  }

  @Override
  public immeuble updateimmeuble(immeuble I) {
    return immeubleRepository.save(I);

  }

  @Override
  public void deleteimmeuble(Long id) {
     immeubleRepository.deleteById(id);
  }

  @Override
    public List<immeuble> getAllimmeuble() {
     return immeubleRepository.findAll();
    }
  }
