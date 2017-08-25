package com.creditcards.jarvis.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiResource;

import javax.persistence.*;

@Entity
@Table(name = "environments")
@JsonApiResource(type = "environments")
public class Environment extends Base {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonApiId
    private Integer id;

    private String name;
    private String url;

    @ManyToOne
    @JsonBackReference
    private Project project;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return String.format("Environment[id=%s, name=%s, url=%s]", id, name, url);
    }
}
