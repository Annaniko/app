package org.example.authenticationapp.controller;

import org.example.authenticationapp.exceptions.NotFoundExceptions;
import org.example.authenticationapp.model.Weight;
import org.example.authenticationapp.service.WeightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="weight", produces="application/json; charset=UTF-8")
public class WeightController {
    private WeightService weightService;

    public WeightController(WeightService weightService) {
        this.weightService = weightService;
    }

    @GetMapping(value ="list", produces="application/json; charset=UTF-8")
    public List<Weight> list(){
        return weightService.AllWeights();
    }

    @GetMapping(value ="{id}", produces="application/json; charset=UTF-8")
    public Weight getOne(@PathVariable String id){
        return getWeight(id);
    }

    private Weight getWeight(String id) {
        return weightService.AllWeights().stream().filter(weight -> weight.get("id").equals(id)).findFirst().orElseThrow(NotFoundExceptions::new);
    }

    @PostMapping(produces="application/json; charset=UTF-8")
    public Weight create(@RequestBody Weight weight){
        weightService.save(weight);
        return weight;
    }

    @PutMapping(value ="{id}", produces="application/json; charset=UTF-8")
    public Weight update(@PathVariable Long id,@RequestBody Weight weight){
        weightService.update(id, weight);
        return weight;
    }

    @DeleteMapping(value ="{id}", produces="application/json; charset=UTF-8")
    public void delete(@PathVariable Long id){
        weightService.remove(id);
    }

}
