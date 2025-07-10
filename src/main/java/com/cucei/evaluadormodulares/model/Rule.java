package com.cucei.evaluadormodulares.model;

import jakarta.persistence.*;

@Entity
@Table(name = "rules")
public class Rule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToOne
    @JoinColumn(name = "rule_section_id")
    private RuleSection ruleSection;

    public Rule() {}

    public Rule(String description, RuleSection ruleSection) {
        this.description = description;
        this.ruleSection = ruleSection;
    }

    public Long getId() { return id; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public RuleSection getRuleSection() { return ruleSection; }

    public void setRuleSection(RuleSection ruleSection) { this.ruleSection = ruleSection; }
}