package com.arthur.citiesapi.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository repository;

    public List<City> getAllCities(){
        return repository.findAll();
    }

    public Page<City> getAllCitiesPage(Pageable page){
        return repository.findAll(page);
    }
}
