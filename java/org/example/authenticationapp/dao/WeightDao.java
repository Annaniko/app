package org.example.authenticationapp.dao;

import org.example.authenticationapp.model.Weight;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WeightDao extends JpaRepository<Weight, Long> {
    Weight findByDate (String date);

    Weight findByValue(String value);
}
