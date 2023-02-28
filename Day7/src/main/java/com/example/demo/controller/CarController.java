package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Car;
import com.example.demo.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
	@Autowired
	CarService service;
	
	@PostMapping("")
	public boolean create(@RequestBody Car car) {
		return service.addCar(car);
	}
	
	@GetMapping("/owner/{owner}")
	public List<Car> getByOwner(@PathVariable int owner){
		return service.getCarByOwner(owner);
	}
	
	@GetMapping("/carname/{carName}")
	public List<Car> getByCarName(@PathVariable String carName){
		return service.getCarByCarName(carName);
	}
	
	@GetMapping("/owner/{owner}/cartype/{carType}")
	public List<Car> getByCarType(@PathVariable int owner,@PathVariable String carType){
		return service.getCarByCarType(owner, carType);
	}
	
	@GetMapping("/address/{address}")
	public List<Car> getByAddress(@PathVariable String address){
		return service.getCarByAddress(address);
	}
}
