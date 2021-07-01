package org.example.authenticationapp.controller;

import org.example.authenticationapp.exceptions.NotFoundExceptions;
import org.example.authenticationapp.model.Nutrition;
import org.example.authenticationapp.service.NutritionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="nutrition", produces="application/json; charset=UTF-8")
public class NutritionController {
    private NutritionService nutritionService;

    public NutritionController(NutritionService nutritionService) {
        this.nutritionService = nutritionService;
    }

    @GetMapping(value ="list", produces="application/json; charset=UTF-8")
    public List<Nutrition> list(){
        return nutritionService.AllNutritions();
    }

    @GetMapping(value ="{id}", produces="application/json; charset=UTF-8")
    public Nutrition getOne(@PathVariable String id){
        return getNutrition(id);
    }

    private Nutrition getNutrition(String id) {
        return nutritionService.AllNutritions().stream().filter(nutrition -> nutrition.get("id").equals(id)).findFirst().orElseThrow(NotFoundExceptions::new);
    }

    @PostMapping(produces="application/json; charset=UTF-8")
    public Nutrition create(@RequestBody Nutrition nutrition){
        nutritionService.save(nutrition);
        return nutrition;
    }

    @PutMapping(value ="{id}", produces="application/json; charset=UTF-8")
    public Nutrition update(@PathVariable Long id,@RequestBody Nutrition nutrition){
        nutritionService.update(id, nutrition);
        return nutrition;
    }

    @DeleteMapping(value ="{id}", produces="application/json; charset=UTF-8")
    public void delete(@PathVariable Long id){
        nutritionService.remove(id);
    }

}
