package com.cucei.evaluadormodulares.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "evaluation_metrics")
public class EvaluationMetric {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "evaluation_id")
    private Evaluation evaluation;

    @OneToMany(mappedBy = "evaluationMetric")
    private List<MetricOption> options = new ArrayList<>();

    public EvaluationMetric() {}

    public EvaluationMetric(String name, Evaluation evaluation) {
        this.name = name;
        this.evaluation = evaluation;
    }

    public Long getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Evaluation getEvaluation() { return evaluation; }

    public void setEvaluation(Evaluation evaluation) { this.evaluation = evaluation; }

    public List<MetricOption> getOptions() { return options; }

    public void setOptions(List<MetricOption> options) { this.options = options; }
}
