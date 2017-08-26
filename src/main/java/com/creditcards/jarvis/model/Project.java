package com.creditcards.jarvis.model;

import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiRelation;
import io.katharsis.resource.annotations.JsonApiResource;
import io.katharsis.resource.annotations.SerializeType;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "projects")
@JsonApiResource(type = "projects")
public class Project extends Base {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonApiId
    private Integer id;

    private String name;
    private String repository;
    private String description;

    @OneToMany(mappedBy = "project", fetch = FetchType.EAGER)
    @JsonApiRelation(serialize = SerializeType.ONLY_ID)
    private Set<Environment> environments;

    @OneToMany(mappedBy = "project", fetch = FetchType.EAGER)
    @JsonApiRelation(serialize = SerializeType.ONLY_ID)
    private Set<Reference> references;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Environment> getEnvironments() {
        return environments;
    }

    public void setEnvironments(Set<Environment> environments) {
        this.environments = environments;
    }

    public Set<Reference> getReferences() {
        return references;
    }

    public void setReferences(Set<Reference> references) {
        this.references = references;
    }

    @Override
    public String toString() {
        return String.format("Project[id=%d, name=%s, repository=%s]", id, name, repository);
    }
}
