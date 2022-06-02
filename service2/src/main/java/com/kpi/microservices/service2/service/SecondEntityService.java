package com.kpi.microservices.service2.service;

import com.kpi.microservices.service2.model.SecondEntity;

import java.util.List;

public interface SecondEntityService {

    List<SecondEntity> getAllSecondEntities();

    SecondEntity getSecondEntityById(Integer id);

    SecondEntity createSecondEntity(SecondEntity entity);

    SecondEntity updateSecondEntity(SecondEntity entity);

    void deleteSecondEntityById(Integer id);
}
