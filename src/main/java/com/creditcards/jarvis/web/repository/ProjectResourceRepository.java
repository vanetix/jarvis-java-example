package com.creditcards.jarvis.web.repository;


import com.creditcards.jarvis.model.Project;
import com.creditcards.jarvis.service.ProjectService;
import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryBase;
import io.katharsis.resource.list.ResourceList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class ProjectResourceRepository extends ResourceRepositoryBase<Project, Long> {
    ProjectService project;

    @Autowired
    public ProjectResourceRepository(ProjectService projectService) {
        super(Project.class);

        project = projectService;
    }

    @Override
    public ResourceList<Project> findAll(QuerySpec querySpec) {
        return querySpec.apply(project.all());
    }
}
