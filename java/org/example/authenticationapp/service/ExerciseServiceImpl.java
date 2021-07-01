package org.example.authenticationapp.service;

import org.example.authenticationapp.dao.ExerciseDao;
import org.example.authenticationapp.model.Exercise;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExerciseServiceImpl implements ExerciseService{
    private final ExerciseDao exerciseDao;

    public ExerciseServiceImpl(ExerciseDao exerciseDao) {

        this.exerciseDao = exerciseDao;
    }

    @Override
    public void save(Exercise exercise) {
        exerciseDao.save(exercise);
    }

    @Override
    public List<Exercise> AllExercises()
    {
        return exerciseDao.findAll();
    }

    @Override
    public Exercise findByDate(String date) {
        return exerciseDao.findByDate(date);
    }

    @Override
    public void update(Long id, Exercise exercise) {
        Exercise dbExercise = exerciseDao.findById(id).orElse(new Exercise());
        dbExercise.setName(exercise.getName());
        dbExercise.setQuantity(exercise.getQuantity());
        exerciseDao.save(dbExercise);
    }

    @Override
    public void remove(Long id) {
        exerciseDao.deleteById(id);
    }

    @Override
    public Exercise findByName(String name) {
        return exerciseDao.findByName(name);
    }
}
