package com.example.VoitureManager.bll;

import java.util.List;


import com.example.VoitureManager.bo.Car;
import com.example.VoitureManager.bo.Park;
import com.example.VoitureManager.bo.ParkingPleinException;


/**
 * Interface de Gestion entr�e sortie voiture et associations voiture / parks
 * @author cduval2022
 *
 */
public interface ParkManager {

	/**
	 * Permet de retrouver une voiture via son ID
	 * @param id id en base de donn�e de la voiture
	 * @return retourne un objet voiture
	 */
	
	public Car getCarByBrandAndModel(String brand, String Model);
	public Park whereIsMyCar(Car car);
	public Car getCarById(Integer id);
	public Park getParkById(Integer id);
	public void addCar(Car car);
	public void delCar(Car car);
	public void addPark(Park park);
	public void delPark(Park park);
	public void addCarToPark(Car car, Park park) throws ParkingPleinException;
	public void removeCarFromPark(Car car, Park park);
	public List<Park> getAllParks();
	public List<Car> getAllCar();
	public List<Car> getAllCarByPark(Park park);
	void addCarToParkById(Integer idCar, Integer idPark) throws ParkingPleinException;
	
	


}
