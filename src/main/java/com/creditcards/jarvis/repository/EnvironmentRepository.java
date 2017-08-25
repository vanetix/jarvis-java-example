package com.creditcards.jarvis.repository;

import com.creditcards.jarvis.model.Environment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvironmentRepository extends CrudRepository<Environment, Long> {
}
