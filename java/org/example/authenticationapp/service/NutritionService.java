package org.example.authenticationapp.service;

import org.example.authenticationapp.model.Nutrition;

import java.util.List;

public interface NutritionService {
    void save(Nutrition nutrition);

    List<Nutrition> AllNutritions();

    Nutrition findByDate(String date);

    void update(Long id, Nutrition nutrition);
    void remove(Long id);
}