package com.arthur.citiesapi.state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

    @Autowired
    StateRepository repository;

    public List<State> getAllStates() {
        return repository.findAll();
    }
}
