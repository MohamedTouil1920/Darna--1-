package com.example.Darna.business.services;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.example.Darna.dao.entities.client;;
@Service
public interface clientServices {
    
    public Optional<client> getClient(Long cin);
    public void addClient (client c);
    public void updateClient (client c);
    public void deleteClient (Long cin);
    public List<client> getAllClient();
}
 