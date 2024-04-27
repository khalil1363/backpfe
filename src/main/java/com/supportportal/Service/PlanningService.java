package com.supportportal.Service;

import java.util.List;

import com.supportportal.Module.Planning;

public interface PlanningService {

    List<Planning> getAllPlanning();

    Planning getPlanningById(Long idPlanning);

    Planning savePlanning(Planning planning);

    void deletePlanning(Long idPlanning);
}