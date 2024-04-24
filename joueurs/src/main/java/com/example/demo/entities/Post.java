package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPost;
    private String nomPost;

    // Getters and setters
    public Long getIdPost() {
        return idPost;
    }

    public void setIdPost(Long idPost) {
        this.idPost = idPost;
    }

    public String getNomPost() {
        return nomPost;
    }

    public void setNomPost(String nomPost) {
        this.nomPost = nomPost;
    }
}