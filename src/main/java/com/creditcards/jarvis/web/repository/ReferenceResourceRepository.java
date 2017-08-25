package com.creditcards.jarvis.web.repository;

import com.creditcards.jarvis.model.Reference;
import com.creditcards.jarvis.service.ReferenceService;
import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryBase;
import io.katharsis.resource.list.ResourceList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class ReferenceResourceRepository extends ResourceRepositoryBase<Reference, Long> {
    ReferenceService reference;

    @Autowired
    public ReferenceResourceRepository(ReferenceService referenceService) {
        super(Reference.class);

        reference = referenceService;
    }

    @Override
    public ResourceList<Reference> findAll(QuerySpec querySpec) {
        return querySpec.apply(reference.all());
    }
}
