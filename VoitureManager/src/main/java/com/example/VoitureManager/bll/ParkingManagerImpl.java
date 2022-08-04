package com.example.VoitureManager.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.VoitureManager.bo.Car;
import com.example.VoitureManager.bo.Park;
import com.example.VoitureManager.bo.ParkingPleinException;
import com.example.VoitureManager.dao.CarDAO;
import com.example.VoitureManager.dao.ParkingDAO;

/**
 * Implementation interface Gestion entr�e sortie voiture et associations voiture / parks
 * @author cduval2022
 *
 */
@Service
public class ParkingManagerImpl implements ParkManager {
	
	@Autowired
	ParkingDAO parkDAO;
	
	@Autowired
	CarDAO carDAO;

	@Override
	public void addCarToPark(Car car, Park park) throws ParkingPleinException {
		if (park.getParked().size() < park.getCapacity()) {
		park.addCar(car);
		parkDAO.save(park); } else {
		throw new ParkingPleinException("Le Parking est d�j� rempli");
		}
	}
	
	@Override
	public void addCarToParkById(Integer idCar, Integer idPark) throws ParkingPleinException {
		Car car = getCarById(idCar);
		Park park = getParkById(idPark);
		if (park.getParked().size() < park.getCapacity()) {
		park.addCar(car);
		parkDAO.save(park); } else {
		throw new ParkingPleinException("Le Parking est d�j� rempli");
		}
	}

	@Override
	public void removeCarFromPark(Car car, Park park) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Park> getAllParks() {
		
		return (List<Park>) parkDAO.findAll();
	}

	@Override
	public List<Car> getAllCar() {
		
		return (List<Car>) carDAO.findAll();
	}

	@Override
	public List<Car> getAllCarByPark(Park park) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCar(Car car) {
		carDAO.save(car);
		
	}

	@Override
	public void delCar(Car car) {
		carDAO.delete(car);
		
	}

	@Override
	public void addPark(Park park) {
		parkDAO.save(park);
		
	}

	@Override
	public void delPark(Park park) {
		parkDAO.delete(park);		
	}

	@Override
	public Car getCarById(Integer id) {
		
			return carDAO.findById(id).orElse(null);

	}

	@Override
	public Park getParkById(Integer id) {
		
		return parkDAO.findById(id).orElse(null);
	}

	@Override
	public Park whereIsMyCar(Car car) {
//		Integer parkID = carDAO.findByBrandAndModel(car.getBrand(), car.getModel()).getPark().getIdPark();
		
		return carDAO.findByBrandAndModel(car.getBrand(), car.getModel()).getPark();
	}

	@Override
	public Car getCarByBrandAndModel(String brand, String Model) {
		
		return carDAO.findByBrandAndModel(brand, Model);
	}



}
