package org.example.authenticationapp.dao;

import org.example.authenticationapp.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseDao extends JpaRepository<Exercise, Long> {
        Exercise findByDate (String date);
        Exercise findByName (String name);
}
