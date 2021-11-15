package com.arthur.citiesapi.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService service;

    @GetMapping("/all-cities")
    public List<City> getAllCities(){
        return service.getAllCities();
    }

    @GetMapping("/get-all-cities-page")
    public Page<City> getAllCitiesPage(Pageable page){
        return service.getAllCitiesPage(page);
    }
}
