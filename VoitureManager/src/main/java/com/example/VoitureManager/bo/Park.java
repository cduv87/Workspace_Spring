package com.example.VoitureManager.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Park {
	
	@Id
	@GeneratedValue
	private Integer idPark;
	private String name;
	private Integer capacity;
	
	@OneToMany(mappedBy = "park")
	@JsonManagedReference
	private List<Car> parked = new ArrayList<Car>();;

	public Park(String name, Integer capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
		
	}
	
	public void addCar(Car car){

		parked.add(car);
		car.setPark(this);

	}
	
	
	
}
