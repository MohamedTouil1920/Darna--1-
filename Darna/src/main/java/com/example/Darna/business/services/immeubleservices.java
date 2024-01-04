package com.example.Darna.business.services;
import java.util.List;
import java.util.Optional;

import com.example.Darna.dao.entities.immeuble;
public interface immeubleservices {

    public Optional<immeuble> getimmeuble(Long id);

    
    public Optional<immeuble> getimmeubleByCode(String id);


    public immeuble addimmeuble(immeuble I);

    
    public immeuble updateimmeuble(immeuble I);

    public void deleteimmeuble(Long id);

    
    public List<immeuble> getAllimmeuble();

    
    

}

