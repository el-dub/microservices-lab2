package com.kpi.microservices.service2.controller;

import com.kpi.microservices.service2.model.SecondEntity;
import com.kpi.microservices.service2.service.SecondEntityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/second-entity")
@AllArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SecondEntityController {

    private final SecondEntityService secondEntityService;

    @GetMapping
    public List<SecondEntity> getAllFirstEntities() {
        return secondEntityService.getAllSecondEntities();
    }

    @GetMapping("/{id}")
    public SecondEntity getFirstEntityById(@PathVariable Integer id) {
        return secondEntityService.getSecondEntityById(id);
    }

    @PostMapping
    public SecondEntity createFirstEntity(@RequestBody SecondEntity entity) {
        return secondEntityService.createSecondEntity(entity);
    }

    @PutMapping
    public SecondEntity updateFirstEntity(@RequestBody SecondEntity entity) {
        return secondEntityService.updateSecondEntity(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteFirstEntityById(@PathVariable Integer id) {
        secondEntityService.deleteSecondEntityById(id);
    }
}
