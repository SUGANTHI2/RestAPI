package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;

@Service
public class CarService {
	@Autowired
	CarRepository repository;
	
	public boolean addCar(Car car) {
		repository.save(car);
		return true;
	}
	
	public List<Car> getCarByOwner(int owner){
		return repository.findByOwner(owner);
	}
	
	public List<Car> getCarByCarName(String carName){
		return repository.findByCarName(carName);
	}
	public List<Car> getCarByCarType(int owner,String carType){
		return repository.findByOwnerAndCarType(owner, carType);
	}
	
	public List<Car> getCarByAddress(String address){
		return repository.findByAddress(address);
	}
}
