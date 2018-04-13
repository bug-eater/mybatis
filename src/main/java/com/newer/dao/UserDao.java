package com.newer.dao;

import com.newer.pojo.Car;

import java.util.List;

public interface UserDao {
    int addCar(Car car);
    int updateCar(Car car);
    int deleteCar(int CarId);
    Car findById(int CarId);
    List<Car> findAll();


}
