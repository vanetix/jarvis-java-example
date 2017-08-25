package com.creditcards.jarvis.web.controller;

import io.katharsis.spring.boot.v3.KatharsisConfigV3;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Import({ KatharsisConfigV3.class })
public class ResourceController {
}
