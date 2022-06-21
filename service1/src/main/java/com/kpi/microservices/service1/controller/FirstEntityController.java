package com.kpi.microservices.service1.controller;

import com.kpi.microservices.service1.exception.NotFoundException;
import com.kpi.microservices.service1.model.FirstEntity;
import com.kpi.microservices.service1.service.FirstEntityService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/first-entity")
@AllArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FirstEntityController {
private static final Logger logger = LoggerFactory.getLogger(FirstEntityController.class);
    private final FirstEntityService firstEntityService;

    @GetMapping
    public List<FirstEntity> getAllFirstEntities() {
        logger.info("Get called");
        return firstEntityService.getAllFirstEntities();
    }

    @GetMapping("/{id}")
    public FirstEntity getFirstEntityById(@PathVariable Integer id) {
        return firstEntityService.getFirstEntityById(id);
    }

    @PostMapping
    public FirstEntity createFirstEntity(@RequestBody FirstEntity entity) {
        return firstEntityService.createFirstEntity(entity);
    }

    @PutMapping
    public FirstEntity updateFirstEntity(@RequestBody FirstEntity entity) {
        return firstEntityService.updateFirstEntity(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteFirstEntityById(@PathVariable Integer id) {
        firstEntityService.deleteFirstEntityById(id);
    }
}
