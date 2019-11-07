package com.example.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Car;

@Repository
public class CarDALImpl implements CarDAL{
	
	@Autowired
	private MongoTemplate mongo;

	@Override
	public List<Car> findAll() {
		return mongo.findAll(Car.class);
	}

	@Override
	public List<Car> findByMake(String make) {
		Query q = new Query();
		q.addCriteria(Criteria.where("make").is(make));
		return mongo.find(q, Car.class);
	}

	@Override
	public Car save(Car c) {
		return mongo.save(c);
	}

}
