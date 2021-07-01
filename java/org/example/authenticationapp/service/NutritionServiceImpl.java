package org.example.authenticationapp.service;

import org.example.authenticationapp.dao.NutritionDao;
import org.example.authenticationapp.model.Nutrition;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutritionServiceImpl implements NutritionService{
    private final NutritionDao nutritionDao;

    public NutritionServiceImpl(NutritionDao nutritionDao) {

        this.nutritionDao = nutritionDao;
    }

    @Override
    public void save(Nutrition nutrition) {
        nutritionDao.save(nutrition);
    }

    @Override
    public List<Nutrition> AllNutritions()
    {
        return nutritionDao.findAll();
    }

    @Override
    public Nutrition findByDate(String date) {
        return nutritionDao.findByDate(date);
    }

    @Override
    public void update(Long id, Nutrition nutrition) {
        Nutrition dbNutrition = nutritionDao.findById(id).orElse(new Nutrition());
        dbNutrition.setName(nutrition.getName());
        dbNutrition.setDate(nutrition.getDate());
        dbNutrition.setWeight(nutrition.getWeight());
        nutritionDao.save(dbNutrition);
    }

    @Override
    public void remove(Long id) {
        nutritionDao.deleteById(id);
    }
}