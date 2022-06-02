package com.kpi.microservices.service1.repository;

import com.kpi.microservices.service1.model.FirstEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstEntityRepository extends JpaRepository<FirstEntity, Integer> {
}
