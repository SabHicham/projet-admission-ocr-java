package com.hicham.bibliotheque.controllers;

import com.hicham.bibliotheque.model.Livre;
import com.hicham.bibliotheque.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LivreController {

    @Autowired
    LivreRepository livreRepository;


    // READ

    @RequestMapping(method = RequestMethod.GET, value = "/mes-livres")
    public String listLivres(Model model){
        model.addAttribute("listLivres", livreRepository.findAll());
        return "mes-livres";
    }

    // DELETE

    @RequestMapping(method = RequestMethod.GET, value = "/delete-livre/{id}" )
    public String deleteLivre(@PathVariable("id") Integer id){
        livreRepository.deleteById(id);
        return "redirect:/mes-livres";
    }

    // UPDATE

    @RequestMapping(method = RequestMethod.GET, value = "/edit-livre/{id}" )
    public String editLivre(@PathVariable("id") Integer id, Model model){
        model.addAttribute("livre", livreRepository.findById(id));
        return "modification-livre";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/edit-livre/{id}" )
    public String editLivreForm(@PathVariable("id") Integer id, Livre livre){
        livre.setId(id);
        livreRepository.save(livre);
        return "redirect:/mes-livres";
    }

    // CREATE

    @RequestMapping(method = RequestMethod.GET, value = "/ajout-livre")
    public String ajoutLivre(Livre livre){
        return "ajout-livre";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/ajout-livre")
    public String ajoutLivreForm(Livre livre){
        livreRepository.save(livre);
        return "redirect:/mes-livres";
    }



}
