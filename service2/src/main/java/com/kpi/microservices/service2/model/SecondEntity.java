package com.kpi.microservices.service2.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "second_entity")
@Data
public class SecondEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
