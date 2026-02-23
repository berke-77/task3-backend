package com.example.demo.entities.concretes;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String username;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @Column(nullable = false)
    private String password;

    public User() {
        
    }

    public int getId() { 
        return id; 
    }
    public void setId(int id) {
        this.id = id; 
    }

    public String getEmail() { 
        return email;
    }
    public void setEmail(String email) {
        this.email = email; 
    }

    public String getUsername() { 
        return username;
    }
    public void setUsername(String username) {
        this.username = username; 
    }

    public Role getRole() {
        return role; 
    }
    public void setRole(Role role) {
        this.role = role; 
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password; 
    }
}
