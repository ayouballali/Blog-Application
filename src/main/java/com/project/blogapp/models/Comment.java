package com.project.blogapp.models;

import jakarta.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String content ;
    @ManyToOne
    private User user ;
    @ManyToOne
    private Post post;

}
