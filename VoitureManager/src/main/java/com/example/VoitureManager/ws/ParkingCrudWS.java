package com.example.VoitureManager.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.VoitureManager.bll.ParkingManagerImpl;
import com.example.VoitureManager.bo.Car;
import com.example.VoitureManager.bo.Park;
import com.example.VoitureManager.bo.ParkingPleinException;


@RestController
public class ParkingCrudWS {
	
	@Autowired
	ParkingManagerImpl parkingManager;
	
	@GetMapping("/addcartopark/{idcar}/{idpark}")
	public void addCarToPark(@PathVariable("idcar") Integer idcar, @PathVariable("idpark") Integer idpark) {
		try {
			parkingManager.addCarToParkById(idcar, idpark);
		} catch (ParkingPleinException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@GetMapping("/createcar/{brand}/{model}")
	public void addCar(@PathVariable("brand") String brand,
			@PathVariable("model") String model) {
		Car car = new Car(brand, model);
		parkingManager.addCar(car);
	}
	
	@GetMapping("/createpark/{name}/{capacity}")
	public void addPark(@PathVariable("name") String name,
			@PathVariable("capacity") Integer capacity) {
		Park park = new Park(name, capacity);
		parkingManager.addPark(park);
	}
	
	@GetMapping("/list/car")
	public List<Car> getAllCar(){
		return parkingManager.getAllCar();
	}
	
	@GetMapping("/list/park")
	public List<Park> getAllPark(){
		return parkingManager.getAllParks();
	}

}
