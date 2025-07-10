package com.cucei.evaluadormodulares.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "evaluations")
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "evaluation")
    private List<EvaluationMetric> metrics = new ArrayList<>();

    public Evaluation() {}

    public Evaluation(String name) {
        this.name = name;
    }

    public Long getId() { return id; }
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<EvaluationMetric> getMetrics() { return metrics; }

    public void setMetrics(List<EvaluationMetric> metrics) { this.metrics = metrics; }
}