package com.example.Darna.web.controlers;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.Darna.business.services.clientServices;
import com.example.Darna.dao.entities.client;



@RequestMapping("/clients")
@Controller
public class clientController {
    // Retrieving All Clients
    @Autowired
    clientServices clientService;

  

    @GetMapping()
    public String getAllClient(Model model) {
        java.util.List<client> listclient=clientService.getAllClient();        
        model.addAttribute("listClient", listclient);
        return "listClient.html";
    }

 

    // Adding a Client
    @GetMapping("/new")
    public String showClientsFrom(Model model){
        model.addAttribute("client", new client(null, null, null, null));
        return "clientForm.html";
    }
    @PostMapping("/save")
    public String addClient(client client , RedirectAttributes ra) {
            clientService.addClient(client);
            ra.addFlashAttribute("message", "The Client has been saved successfully");
        return "redirect:/clients";
    }

    // Updating a Client
    @GetMapping("/update/{cin}")
    public String showUpdateForm(@PathVariable("cin") Long cin ,Model model ){
            Optional<client> client =clientService.getClient(cin);
            if (client !=null) {
            model.addAttribute("client", client);
                
            }
            return "clientForm";
    }

    // Deleting a Client
    @GetMapping("/delete/{cin}")
    public String deleteclient(@PathVariable("cin") Long cin) {
        clientService.deleteClient(cin);
        return "redirect:/clients";
    }
}