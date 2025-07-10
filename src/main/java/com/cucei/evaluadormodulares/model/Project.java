package com.cucei.evaluadormodulares.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "project")
    private List<User> users = new ArrayList<>();

    @OneToMany(mappedBy = "project")
    private List<Score> scores = new ArrayList<>();

    @OneToMany(mappedBy = "project")
    private List<File> files = new ArrayList<>();

    public Project() {}

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public List<User> getUsers() { return users; }

    public void setUsers(List<User> users) { this.users = users; }

    public List<Score> getScores() { return scores; }

    public void setScores(List<Score> scores) { this.scores = scores; }

    public List<File> getFiles() { return files; }

    public void setFiles(List<File> files) { this.files = files; }
}