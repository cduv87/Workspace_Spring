package com.example.bll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.VoitureManager.bll.ParkManager;
import com.example.VoitureManager.bo.Car;
import com.example.VoitureManager.bo.Park;
import com.example.VoitureManager.bo.ParkingPleinException;
import com.example.VoitureManager.dao.CarDAO;

@SpringBootTest
class ParkingManagerTest {
	@Autowired
		ParkManager manager;
	
	@Autowired
		CarDAO carDAO;
	
	@Test
	void addCarToParkTest() {
		
		
		Car c10 = new Car("Toyota", "Hilux");
		Park p3 = new Park("Crozon Park", 4);
		manager.addCar(c10);
		manager.addPark(p3);
		try {
			manager.addCarToPark(c10, p3);
		} catch (ParkingPleinException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String pCar = manager.whereIsMyCar(c10).getName();
		System.out.println(pCar);
		String pDB = p3.getName();
		System.out.println(pDB);
		assertEquals(pCar, pDB);
		
	}



}
