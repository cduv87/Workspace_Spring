package com.example.VoitureManager.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.VoitureManager.bo.Park;

public interface ParkingDAO extends CrudRepository<Park, Integer> {
 
}
