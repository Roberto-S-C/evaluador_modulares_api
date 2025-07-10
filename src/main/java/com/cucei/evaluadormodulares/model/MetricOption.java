package com.cucei.evaluadormodulares.model;

import jakarta.persistence.*;

@Entity
@Table(name = "metric_options")
public class MetricOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer value;

    @ManyToOne
    @JoinColumn(name = "evaluation_metric_id")
    private EvaluationMetric evaluationMetric;

    public MetricOption() {}

    public MetricOption(String description, Integer value, EvaluationMetric evaluationMetric) {
        this.description = description;
        this.value = value;
        this.evaluationMetric = evaluationMetric;
    }

    public Long getId() { return id; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public Integer getValue() { return value; }

    public void setValue(Integer value) { this.value = value; }

    public EvaluationMetric getEvaluationMetric() { return evaluationMetric; }

    public void setEvaluationMetric(EvaluationMetric evaluationMetric) { this.evaluationMetric = evaluationMetric; }
}