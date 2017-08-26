package com.creditcards.jarvis.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiRelation;
import io.katharsis.resource.annotations.JsonApiResource;
import io.katharsis.resource.annotations.SerializeType;

import javax.persistence.*;

@Entity
@Table(name = "references")
@JsonApiResource(type = "references")
public class Reference extends Base {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonApiId
    private Integer id;

    private String name;
    private String url;

    @ManyToOne
    @JsonBackReference
    @JsonApiRelation(serialize = SerializeType.EAGER)
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
        return String.format("Reference[id=%s, name=%s, url=%s]", id, name, url);
    }
}
