package com.company.accounting_for_vacancies.entity;

import io.jmix.core.FileRef;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@JmixEntity
@Table(name = "VACANCIES", indexes = {
        @Index(name = "IDX_VACANCIES_STRUCTURAL_ENTITY", columnList = "STRUCTURAL_ENTITY_ID")
})
@Entity
public class Vacancies {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "START_DATE", nullable = false)
    @NotNull
    private LocalDate startDate;

    @Column(name = "END_DATE", nullable = false)
    @NotNull
    private LocalDate endDate;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SKILLS")
    private String skills;

    @JoinColumn(name = "STRUCTURAL_ENTITY_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Structural_unit structuralEntity;

    @Column(name = "RESUME", length = 1024)
    private FileRef resume;

    public FileRef getResume() {
        return resume;
    }

    public void setResume(FileRef resume) {
        this.resume = resume;
    }

    public Structural_unit getStructuralEntity() {
        return structuralEntity;
    }

    public void setStructuralEntity(Structural_unit structuralEntity) {
        this.structuralEntity = structuralEntity;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}