package com.creditcards.jarvis.web.repository;

import com.creditcards.jarvis.model.Environment;
import com.creditcards.jarvis.service.EnvironmentService;
import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryBase;
import io.katharsis.resource.list.ResourceList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class EnvironmentResourceRepository extends ResourceRepositoryBase<Environment, Long> {
     EnvironmentService environment;

    @Autowired
    public EnvironmentResourceRepository(EnvironmentService environmentService) {
        super(Environment.class);

        environment = environmentService;
    }

    @Override
    public ResourceList<Environment> findAll(QuerySpec querySpec) {
        return querySpec.apply(environment.all());
    }
}
