package com.cucei.evaluadormodulares.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(name = "last_name")
    private String lastName;

    private String email;
    private String password;
    private String role;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
    
    @OneToMany(mappedBy = "user")
    private List<Score> scores = new ArrayList<>(); 

    public User() {}

    public User(String name, String lastName, String email, String password, String role, Project project) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.project = project;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }

    public void setRole(String role) { this.role = role; }

    public Project getProject() { return project; }

    public void setProject(Project project) { this.project = project; }

    public List<Score> getScores() { return scores; }

    public void setScores(List<Score> scores) { this.scores = scores; }
}
