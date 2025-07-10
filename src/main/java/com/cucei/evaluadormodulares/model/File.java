package com.cucei.evaluadormodulares.model;

import jakarta.persistence.*;

@Entity
@Table(name = "files")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String link;

    @ManyToOne
    @JoinColumn(name = "document_id")
    private Document document;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    public File() {}

    public File(String link, Document document, Project project) {
        this.link = link;
        this.document = document;
        this.project = project;
    }

    public int getId() { return id; }

    public String getLink() { return link; }

    public void setLink(String link) { this.link = link; }

    public Document getDocument() { return document; }

    public void setDocument(Document document) { this.document = document; }

    public Project getProject() { return project; }

    public void setProject(Project project) { this.project = project; }
}