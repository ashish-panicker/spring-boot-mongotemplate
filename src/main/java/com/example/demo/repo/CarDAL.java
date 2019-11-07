package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Car;

public interface CarDAL {
	
	List<Car> findAll();
	
	List<Car> findByMake(String make);
	
	Car save(Car c);

}
