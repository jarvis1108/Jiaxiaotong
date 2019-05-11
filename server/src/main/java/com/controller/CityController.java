package com.controller;

import com.entity.City;
import com.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CityController {


    @Autowired
    private CityRepository cityRepository;

    //http://localhost:8888/saveCity?cityName=beijing&cityIntroduce=test
    @GetMapping(value = "saveCity")
    public String saveCity(String cityName,String cityIntroduce){
        City city = new City(cityName,cityIntroduce);
        cityRepository.save(city);
        return "success";
    }

    //http://localhost:8888/updateCity?cityId=3&cityName=沈阳&cityIntroduce=辽宁省省会
    @GetMapping(value = "updateCity")
    public String updateCity(int cityId,String cityName,String cityIntroduce){
        City city = new City(cityId,cityName,cityIntroduce);
        cityRepository.save(city);
        return "success";
    }

}
