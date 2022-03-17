package com.example.oracleDemo.service;

import com.example.oracleDemo.model.Car;
import com.example.oracleDemo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepository;

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car create(Car car) {
        return carRepository.save(car);
    }
}
