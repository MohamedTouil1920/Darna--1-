package com.example.Darna.business.servicesImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Darna.business.services.operationServices;
import com.example.Darna.dao.entities.client;
import com.example.Darna.dao.entities.operation;
import com.example.Darna.dao.repositories.operationRepository;

@Service
public class operationServicesImpl implements operationServices {
    
    @Autowired
    operationRepository operationRepository;



    @Override
    public Optional<operation> getOperationById(Long id) {
        return operationRepository.findById(id);
    }

    @Override
    public void addOperation(operation o) {
        operationRepository.save(o);
    }

    @Override
    public void updateOperation(operation o) {
        operationRepository.save(o);
    }

    @Override
    public void deleteOperation(Long id) {
        operationRepository.deleteById(id);
    }

    @Override
    public List<operation> getAllOperation() {
        return operationRepository.findAll();
    }
}