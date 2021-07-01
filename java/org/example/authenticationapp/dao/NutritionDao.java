package org.example.authenticationapp.dao;

import org.example.authenticationapp.model.Nutrition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutritionDao extends JpaRepository<Nutrition, Long> {
        Nutrition findByDate (String date);
}
