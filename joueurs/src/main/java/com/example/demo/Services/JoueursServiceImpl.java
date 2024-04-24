package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.aziz.projets.entities.Joueurs; // Importer l'entité Joueurs
import com.aziz.projets.entities.Post; // Importer l'entité Post
import com.aziz.projets.repos.JoueursRepository; // Importer le repository pour Joueurs

@Service
public class JoueursServiceImpl implements JoueursService { // Modifier le nom de la classe

    @Autowired
    JoueursRepository joueursRepository; // Modifier le nom du repository

    @Override
    public Joueurs saveJoueurs(Joueurs j) {
        return joueursRepository.save(j);
    }

    @Override
    public Joueurs updateJoueurs(Joueurs j) {
        return joueursRepository.save(j);
    }

    @Override
    public void deleteJoueurs(Joueurs j) {
        joueursRepository.delete(j);
    }

    @Override
    public void deleteJoueursById(Long id) {
        joueursRepository.deleteById(id);
    }

    @Override
    public Joueurs getJoueurs(Long id) {
        return joueursRepository.findById(id).get();
    }

    @Override
    public List<Joueurs> getAllJoueurs() {
        return joueursRepository.findAll();
    }

    @Override
    public List<Joueurs> findByNomJoueurs(String nom) {
        return joueursRepository.findByNomJoueurs(nom);
    }

    @Override
    public List<Joueurs> findByNomJoueursContains(String nom) {
        return joueursRepository.findByNomJoueursContains(nom);
    }

    @Override
    public List<Joueurs> findByNomSalaire(String nom, Double Salaire) {
        return joueursRepository.findByNomSalaire(nom, Salaire);
    }

    @Override
    public List<Joueurs> findByPost(Post post) {
        return joueursRepository.findByPost(post);
    }

    @Override
    public List<Joueurs> findByPostIdPost(Long id) {
        return joueursRepository.findByPostIdPost(id);
    }

    @Override
    public List<Joueurs> findByOrderByNomJoueursAsc() {
        return joueursRepository.findByOrderByNomJoueursAsc();
    }

    @Override
    public List<Joueurs> trierJoueursNomsSalaire() {
        return joueursRepository.trierJoueursNomsSalaire();
    }

    @Override
    public Page<Joueurs> getAllJoueursParPage(int page, int size) {
        return joueursRepository.findAll(PageRequest.of(page, size));
    }
}
