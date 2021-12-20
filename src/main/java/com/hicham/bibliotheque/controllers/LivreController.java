package com.hicham.bibliotheque.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LivreController {

    @GetMapping("/mes-livres")
    public String listLivres(){
        return "mes-livres";
    }

    @GetMapping("/ajout-livre")
    public String ajoutLivre(){
        return "ajout-livre";
    }
}
