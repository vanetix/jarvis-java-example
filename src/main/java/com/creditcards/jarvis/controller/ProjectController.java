package com.creditcards.jarvis.controller;

import com.creditcards.jarvis.model.Project;
import com.creditcards.jarvis.service.ProjectService;
import io.katharsis.spring.boot.v3.KatharsisConfigV3;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Import({ KatharsisConfigV3.class })
public class ProjectController {

    private ProjectService project;

    public ProjectController(ProjectService service) {
        project = service;
    }

    @GetMapping(path = "/projects", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Project>> index() {
        return ResponseEntity.ok(project.all());
    }
}
