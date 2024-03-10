package com.project.blogapp.models;

import jakarta.persistence.*;

@Entity
public class Follow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User followedUser;
    @ManyToOne
    private User followingUser;

}
