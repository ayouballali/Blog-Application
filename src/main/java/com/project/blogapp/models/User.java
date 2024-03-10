package com.project.blogapp.models;

import com.project.blogapp.models.enums.Roles;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @OneToMany
    private List<Post> posts;
    private Roles role;
    private String email;
    private String password_hash;
    private String fullName;
    private String bio;
    private String location;
    private Date dateOfBirth;
    private Date lastLoginAt;
    private boolean isActive;
}
