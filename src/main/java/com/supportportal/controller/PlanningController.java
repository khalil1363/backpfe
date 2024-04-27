package com.supportportal.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supportportal.Module.Planning;
import com.supportportal.Service.PlanningService;

@RestController
@RequestMapping("/api/planning")
public class PlanningController {

    @Autowired
    private PlanningService planningService;

    @GetMapping
    public List<Planning> getAllPlanning() {
        return planningService.getAllPlanning();
    }

    @GetMapping("/{idPlanning}")
    public Planning getPlanningById(@PathVariable Long idPlanning) {
        return planningService.getPlanningById(idPlanning);
    }

    @PostMapping("/add")
    public Planning savePlanning(@RequestBody Planning planning) {
        return planningService.savePlanning(planning);
    }

    @PutMapping("/{idPlanning}")
    public Planning updatePlanning(@PathVariable Long idPlanning, @RequestBody Planning planning) {
        return planningService.savePlanning(planning);
    }

    @DeleteMapping("/{idPlanning}")
    public void deletePlanning(@PathVariable Long idPlanning) {
        planningService.deletePlanning(idPlanning);
    }
}