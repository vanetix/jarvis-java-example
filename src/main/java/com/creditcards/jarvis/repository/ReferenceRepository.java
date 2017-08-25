package com.creditcards.jarvis.repository;

import com.creditcards.jarvis.model.Reference;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReferenceRepository extends CrudRepository<Reference, Long> {
}
