package com.kpi.microservices.service1.service.impl;

import com.kpi.microservices.service1.exception.NotFoundException;
import com.kpi.microservices.service1.model.FirstEntity;
import com.kpi.microservices.service1.repository.FirstEntityRepository;
import com.kpi.microservices.service1.service.FirstEntityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FirstEntityServiceImpl implements FirstEntityService {

    private final FirstEntityRepository firstEntityRepository;

    @Override
    public List<FirstEntity> getAllFirstEntities() {
        return firstEntityRepository.findAll();
    }

    @Override
    public FirstEntity getFirstEntityById(Integer id) {
        return firstEntityRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("FirstEntity with id %s not found", id)));
    }

    @Override
    public FirstEntity createFirstEntity(FirstEntity entity) {
        return firstEntityRepository.save(entity);
    }

    @Override
    public FirstEntity updateFirstEntity(FirstEntity entity) {
        Integer entityId = entity.getId();
        if (!firstEntityRepository.existsById(entityId)) {
            throw new NotFoundException(String.format("FirstEntity with id %s not found", entityId));
        }
        return firstEntityRepository.save(entity);
    }

    @Override
    public void deleteFirstEntityById(Integer id) {
        firstEntityRepository.deleteById(id);
    }
}
