package com.creditcards.jarvis.web.controller;

import io.katharsis.resource.registry.RegistryEntry;
import io.katharsis.resource.registry.ResourceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class InfoController {
    private ResourceRegistry registry;

    @Autowired
    public InfoController(ResourceRegistry reg) {
        registry = reg;
    }

    @GetMapping(path = "/info", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Map> resourcesInfo() {
        Map<String, String> result = new HashMap<>();

        for (RegistryEntry entry : registry.getResources()) {
            String url = registry.getResourceUrl(entry.getResourceInformation());

            result.put(entry.getResourceInformation().getResourceType(), url);
        }

        return ResponseEntity.ok(result);
    }
}
