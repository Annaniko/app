package org.example.authenticationapp.service;

import org.example.authenticationapp.model.Exercise;

import java.util.List;

public interface ExerciseService {
    void save(Exercise exercise);

    List<Exercise> AllExercises();

    Exercise findByDate(String date);

    Exercise findByName(String name);

    void update(Long id, Exercise exercise);
    void remove(Long id);
}
