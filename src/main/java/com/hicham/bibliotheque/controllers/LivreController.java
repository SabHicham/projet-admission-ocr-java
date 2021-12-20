package com.hicham.bibliotheque.controllers;

import com.hicham.bibliotheque.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LivreController {

    @Autowired
    LivreRepository livreRepository;

    @RequestMapping("/mes-livres")
    public String listLivres(Model model){

        model.addAttribute("listLivres", livreRepository.findAll());
        return "mes-livres";
    }

}
