package com.example.Darna.business.services;



import java.util.List;
import java.util.Optional;


import com.example.Darna.dao.entities.operation;



public interface operationServices {
    
  
    public Optional<operation> getOperationById(Long id);

    public void addOperation (operation o);
    public void updateOperation (operation o);
    public void deleteOperation (Long id);
    public List<operation> getAllOperation();

}
    
