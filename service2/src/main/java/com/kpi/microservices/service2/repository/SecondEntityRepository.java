package com.kpi.microservices.service2.repository;

import com.kpi.microservices.service2.model.SecondEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondEntityRepository extends JpaRepository<SecondEntity, Integer> {
}
