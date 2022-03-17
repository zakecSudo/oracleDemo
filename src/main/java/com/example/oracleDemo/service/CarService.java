package com.example.oracleDemo.service;

import com.example.oracleDemo.model.Car;

import java.util.List;

public interface CarService {

    public List<Car> findAll();

    public Car create(Car car);
}
