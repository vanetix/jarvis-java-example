package com.creditcards.jarvis.service;

import com.creditcards.jarvis.model.Reference;
import com.creditcards.jarvis.repository.ReferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReferenceService {
    private ReferenceRepository repository;

    @Autowired
    public ReferenceService(ReferenceRepository repo) {
        repository = repo;
    }

    public List<Reference> all() {
        Iterable<Reference> references = repository.findAll();
        List<Reference> list = new ArrayList<>();

        references.forEach(list::add);

        return list;
    }
}
