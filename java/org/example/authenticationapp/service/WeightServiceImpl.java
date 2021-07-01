package org.example.authenticationapp.service;

import org.example.authenticationapp.model.Weight;
import org.example.authenticationapp.dao.WeightDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeightServiceImpl implements WeightService{
    private final WeightDao weightDao;

    public WeightServiceImpl(WeightDao weightDao) {

        this.weightDao = weightDao;
    }

    @Override
    public void save(Weight weight) {
        weightDao.save(weight);
    }

    @Override
    public List<Weight> AllWeights()
    {
        return weightDao.findAll();
    }

    @Override
    public Weight findByDate(String date) {
        return weightDao.findByDate(date);
    }

    @Override
    public Weight findByValue(String value) {
        return weightDao.findByValue(value);
    }

    @Override
    public void update(Long id, Weight weight) {
        Weight dbWight = weightDao.findById(id).orElse(new Weight());
        dbWight.setDate(weight.getDate());
        dbWight.setValue(weight.getValue());
        weightDao.save(dbWight);
    }

    @Override
    public void remove(Long id) {
        weightDao.deleteById(id);
    }

    @Override
    public Weight findByWeight(String weight) {
        return weightDao.findByDate(weight);
    }
}