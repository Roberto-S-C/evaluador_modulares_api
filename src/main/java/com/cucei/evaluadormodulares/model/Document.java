package com.cucei.evaluadormodulares.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "documents")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String format;

    @OneToMany(mappedBy = "document")
    private List<File> files = new ArrayList<>();

    public Document() {}

    public Document(String name, String format) {
        this.name = name;
        this.format = format;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getFormat() { return format; }

    public void setFormat(String format) { this.format = format; }

    public List<File> getFiles() { return files; }

    public void setFiles(List<File> files) { this.files = files; }
}
