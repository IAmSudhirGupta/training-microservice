package com.training.microservice.nosql.repositories;

import org.springframework.data.repository.CrudRepository;

import com.training.microservice.nosql.models.Car;


public interface CarMongoRepository extends CrudRepository<Car, String> {

}
