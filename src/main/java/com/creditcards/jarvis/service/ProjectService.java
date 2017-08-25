package com.creditcards.jarvis.service;

import com.creditcards.jarvis.model.Project;
import com.creditcards.jarvis.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {
    private ProjectRepository repository;

    @Autowired
    public ProjectService(ProjectRepository repo) {
        repository = repo;
    }

    public List<Project> all() {
        Iterable<Project> projects = repository.findAll();
        List<Project> list = new ArrayList<>();

        projects.forEach(list::add);

        return list;
    }
}
