package com.cucei.evaluadormodulares.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "rule_sections")
public class RuleSection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "ruleSection")
    private List<Rule> rules = new ArrayList<>();

    public RuleSection() {}

    public RuleSection(String name) {
        this.name = name;
    }

    public Long getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Rule> getRules() { return rules; }

    public void setRules(List<Rule> rules) { this.rules = rules; }
}