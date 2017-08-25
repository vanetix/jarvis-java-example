package com.creditcards.jarvis.service;

import com.creditcards.jarvis.model.Environment;
import com.creditcards.jarvis.repository.EnvironmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnvironmentService {
    private EnvironmentRepository repository;

    @Autowired
    public EnvironmentService(EnvironmentRepository repo) {
        repository = repo;
    }

    public List<Environment> all() {
        Iterable<Environment> references = repository.findAll();
        List<Environment> list = new ArrayList<>();

        references.forEach(list::add);

        return list;
    }
}
