package org.example.authenticationapp.service;

import org.example.authenticationapp.model.Weight;

import java.util.List;

public interface WeightService {
    void save(Weight weight);

    List<Weight> AllWeights();

    Weight findByDate(String date);

    Weight findByValue(String value);

    void update(Long id, Weight weight);
    void remove(Long id);

    Weight findByWeight(String weight);
}

