package com.example.Darna.web.controlers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Darna.business.services.operationServices;
import com.example.Darna.dao.entities.client;
import com.example.Darna.dao.entities.immeuble;
import com.example.Darna.dao.entities.operation;
import com.example.Darna.dao.repositories.immeubleRepository;
import com.example.Darna.dao.repositories.clientRepository;
@RequestMapping("/operations")
@Controller
public class operationControler {
    @Autowired
    operationServices operationService;

    @Autowired
    immeubleRepository immeubleRepository;

    @Autowired
    clientRepository clientRepository;
    //Retrieving All Operations

    @GetMapping()
    public String getAllOperation(Model model) {
        java.util.List<operation> listoperation=operationService.getAllOperation();      
        model.addAttribute("listoperation", listoperation);
        return "operationlist";
    }
   
    @GetMapping("/new")
    public String showOperationForm(Model model ) {
            List<immeuble> immeuble=immeubleRepository.findAll();
            List<client> clients=clientRepository.findAll();

            model.addAttribute("immeubles", immeuble);
            model.addAttribute("clients", clients);

            model.addAttribute("operation", new operation(null, null, 
            null, null, null,null, null,null, null));
            return "operationForm";

        }
    @PostMapping("/save")
    public String  addOperation(operation operation) {
        /*Long day=operation.countDay(operation.getDateDebut(), operation.getDateFin());
        Long prix=day*operation.getIdImmeuble().getPrixLoc();*/
        operation.setFraisLoc(prix);
        operationService.addOperation(operation);        
        return "redirect:/operations";
    }
    

    // Updating an Operation
    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") Long id ,Model model ){
            Optional<operation> operation =operationService.getOperationById(id);
            if (operation !=null) {
            model.addAttribute("operation", operation);
                
            }
            return "operationForm";
    }


    // Deleting an Operation
    @DeleteMapping("{id}/delete")
    public String deleteOperation(@PathVariable("id") Long id) {
        operationService.deleteOperation(id);
        return "redirect:/operations";
    }
 
}