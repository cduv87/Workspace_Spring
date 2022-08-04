package com.example.VoitureManager.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.VoitureManager.bo.Car;


public interface CarDAO extends CrudRepository<Car, Integer> {
	
	Car findByBrandAndModel(String brand, String model);

}
