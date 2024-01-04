package com.example.Darna.web.models;

    
import java.util.Date;

import com.example.Darna.dao.entities.client;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class operationForm {
    
    private Long id;
    private Date dateDebut;
    private Date dateFin;
    private String garantie;
    private String montantGarantie;
    private client nomClient;
    private client cinClient;

}
