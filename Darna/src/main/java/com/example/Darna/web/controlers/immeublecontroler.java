package com.example.Darna.web.controlers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.Darna.business.services.immeubleservices;
import com.example.Darna.dao.entities.immeuble;



@RequestMapping("/immeuble")
@Controller
public class immeublecontroler {

    // Retrieving All Cars
    @Autowired
    immeubleservices immeubleservices;

    @GetMapping()
    public String getAllimmeubles(Model model) {
        List<immeuble> listimmeuble = immeubleservices.getAllimmeuble();
        model.addAttribute("listimmeuble", listimmeuble);
        return "carlist";
    }

    
    @GetMapping("/new")
    public String showCarForm(Model model) {
        model.addAttribute("immeuble", new immeuble(null, null, null, null, null, null, 0));
        return "carform";

    }

    @PostMapping("/save")
    public String addimmeuble(immeuble immeuble, RedirectAttributes ra) {
        immeubleservices.addimmeuble(immeuble);
        ra.addFlashAttribute("message", "The immeuble has been saved successfully");

        return "redirect:/mmeuble";
    }

    // Updating a Car
    @GetMapping("/update/{Immatricule}")
    public String showUpdateForm(@PathVariable("Immatricule") Long id, Model model) {
        Optional<immeuble> immeuble = immeubleservices.getimmeuble(id);
        if (immeuble != null) {
            model.addAttribute("immeuble", immeuble);

        }
        return "immeubleForm";
    }

    // Deleting an immeuble
    @GetMapping("/delete/{Immatricule}")
    public String deleteCar(@PathVariable("Immatricule") Long Immatricule) {
        immeubleservices.deleteimmeuble(Immatricule);
        return "redirect:/immeubles";
    }

}