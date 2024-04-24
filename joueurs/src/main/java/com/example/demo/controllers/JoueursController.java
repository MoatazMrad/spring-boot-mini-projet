package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.aziz.projets.entities.Joueur;
import com.aziz.projets.entities.Post;
import com.aziz.projets.service.JoueurService;
import com.aziz.projets.service.PostService;

@Controller
public class JoueurController {
    @Autowired
    JoueurService joueurService;

    @Autowired
    PostService postService;

    @RequestMapping("/ListeJoueurs")
    public String listeJoueurs(ModelMap modelMap) {
        modelMap.addAttribute("joueurs", joueurService.getAllJoueurs());
        return "listeJoueurs";
    }

    @RequestMapping("/showCreate")
    public String showCreate(ModelMap modelMap) {
        modelMap.addAttribute("posts", postService.getAllPosts());
        return "createJoueur";
    }

    @RequestMapping(value = "/saveJoueur", method = RequestMethod.POST)
    public String saveJoueur(@ModelAttribute("joueur") Joueur joueur) {
        joueurService.saveJoueur(joueur);
        return "createJoueur";
    }

    @ModelAttribute("joueur")
    public Joueur getJoueur() {
        return new Joueur();
    }
}