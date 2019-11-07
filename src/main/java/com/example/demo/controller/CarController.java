package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.repo.CarDAL;

@RestController
public class CarController {
	
	@Autowired
	private CarDAL carRepo;
	
	
	@PostMapping("/cars")
	public Car create(@RequestBody Car c) {
		return carRepo.save(c);
	}
	
	@GetMapping("/cars")
	public List<Car> fidnAll(){
		return carRepo.findAll();
	}
	
	@GetMapping("/cars/{make}")
	public List<Car> findByMake(@PathVariable String make){
		return carRepo.findByMake(make);
	}

}
