package org.example.authenticationapp.controller;

import org.example.authenticationapp.exceptions.NotFoundExceptions;
import org.example.authenticationapp.model.Exercise;
import org.example.authenticationapp.service.ExerciseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "exercise", produces="application/json; charset=UTF-8")
public class ExerciseController {
    private ExerciseService exerciseService;

    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping(value = "list", produces="application/json; charset=UTF-8")
    public List<Exercise> list(){
        return exerciseService.AllExercises();
    }

    @GetMapping(value = "{id}", produces="application/json; charset=UTF-8")
    public Exercise getOne(@PathVariable String id){
        return getExercise(id);
    }

    private Exercise getExercise(String id) {
        return exerciseService.AllExercises().stream().filter(exercise -> exercise.get("id").equals(id)).findFirst().orElseThrow(NotFoundExceptions::new);
    }

    @PostMapping(produces="application/json; charset=UTF-8")
    public Exercise create(@RequestBody Exercise exercise){
        exerciseService.save(exercise);
        return exercise;
    }

    @PutMapping(value = "{id}", produces="application/json; charset=UTF-8")
    public Exercise update(@PathVariable Long id,@RequestBody Exercise exercise){
        exerciseService.update(id, exercise);
        return exercise;
    }

    @DeleteMapping(value = "{id}", produces="application/json; charset=UTF-8")
    public void delete(@PathVariable Long id){
        exerciseService.remove(id);
    }

}
