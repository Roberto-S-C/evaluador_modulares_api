package com.cucei.evaluadormodulares.model;

import jakarta.persistence.*;

@Entity
@Table(name = "scores")
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Integer value;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Score() {}

    public Score(Integer value, Project project, User user) {
        this.value = value;
        this.project = project;
        this.user = user;
    }

    public int getId() { return id; }

    public Integer getValue() { return value; }

    public void setValue(Integer value) { this.value = value; }

    public Project getProject() { return project; }

    public void setProject(Project project) { this.project = project; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }
}