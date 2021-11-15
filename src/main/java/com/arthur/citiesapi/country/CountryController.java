package com.arthur.citiesapi.country;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/get-all-cities")
    public List<Country> getAllCountries(){
        return service.getAllCountries();
    }

    @GetMapping("/get-city-by-id/{id}")
    public ResponseEntity getCountryById(@PathVariable(name = "id") Long id){
        return service.getCountryById(id);
    }

    @GetMapping("/get-all-cities-pageable")
    public Page<Country> countries(Pageable page){
        return service.pageableCountries(page);
    }
}
