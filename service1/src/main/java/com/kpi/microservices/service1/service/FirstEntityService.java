package com.kpi.microservices.service1.service;

import com.kpi.microservices.service1.model.FirstEntity;

import java.util.List;

public interface FirstEntityService {

    List<FirstEntity> getAllFirstEntities();

    FirstEntity getFirstEntityById(Integer id);

    FirstEntity createFirstEntity(FirstEntity entity);

    FirstEntity updateFirstEntity(FirstEntity entity);

    void deleteFirstEntityById(Integer id);
}
