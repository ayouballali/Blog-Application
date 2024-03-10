package com.project.blogapp.models;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String body ;
    @ManyToOne
    private User user;
    private String media;
    private String status;
    @OneToMany
    private List<Comment> comments;

}
