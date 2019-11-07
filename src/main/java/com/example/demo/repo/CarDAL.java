package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Car;

public interface CarDAL {
	
	List<Car> findAll();
	
	List<Car> findByMake(String make);
	
	List<Car> findMakeIn(List<String> list);
	
	Car save(Car c);
	
	

}
