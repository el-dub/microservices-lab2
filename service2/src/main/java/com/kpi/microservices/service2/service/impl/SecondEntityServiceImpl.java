package com.kpi.microservices.service2.service.impl;

import com.kpi.microservices.service2.exception.NotFoundException;
import com.kpi.microservices.service2.model.SecondEntity;
import com.kpi.microservices.service2.repository.SecondEntityRepository;
import com.kpi.microservices.service2.service.SecondEntityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SecondEntityServiceImpl implements SecondEntityService {

    private final SecondEntityRepository secondEntityRepository;

    @Override
    public List<SecondEntity> getAllSecondEntities() {
        return secondEntityRepository.findAll();
    }

    @Override
    public SecondEntity getSecondEntityById(Integer id) {
        return secondEntityRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("SecondEntity with id %s not found", id)));
    }

    @Override
    public SecondEntity createSecondEntity(SecondEntity entity) {
        return secondEntityRepository.save(entity);
    }

    @Override
    public SecondEntity updateSecondEntity(SecondEntity entity) {
        Integer entityId = entity.getId();
        if (!secondEntityRepository.existsById(entityId)) {
            throw new NotFoundException(String.format("SecondEntity with id %s not found", entityId));
        }
        return secondEntityRepository.save(entity);
    }

    @Override
    public void deleteSecondEntityById(Integer id) {
        secondEntityRepository.deleteById(id);
    }
}
