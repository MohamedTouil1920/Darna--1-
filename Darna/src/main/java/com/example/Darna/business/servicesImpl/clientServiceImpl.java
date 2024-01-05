package com.example.Darna.business.servicesImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Darna.business.services.clientServices;
import com.example.Darna.dao.entities.Client;
import com.example.Darna.dao.repositories.clientRepository;;
@Service
public class clientServiceImpl  implements clientServices{

    @Autowired
    clientRepository clientRepository;
    @Override
    public Optional<Client> getClient(Long cin) {
        return clientRepository.findById(cin);
    }



    @Override
    public void deleteClient(Long cin) {
        clientRepository.deleteById(cin);
    }

    @Override
    public List<Client> getAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public void addClient(Client c) {
                clientRepository.save(c);

    }

    @Override
    public void updateClient(Client c) {
                clientRepository.save(c);

    }
    
}
