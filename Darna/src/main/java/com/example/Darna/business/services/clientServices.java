package com.example.Darna.business.services;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.example.Darna.dao.entities.Client;;
@Service
public interface clientServices {
    
    public Optional<Client> getClient(Long cin);
    public void addClient (Client c);
    public void updateClient (Client c);
    public void deleteClient (Long cin);
    public List<Client> getAllClient();
}
 