package com.arthur.citiesapi.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    CountryRepository repository;

    public List<Country> getAllCountries(){
        return repository.findAll();
    }

    public ResponseEntity getCountryById(Long id){
        Optional<Country> optional = repository.findById(id);

        if (optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public Page<Country> pageableCountries(Pageable page){
        return repository.findAll(page);
    }
}
