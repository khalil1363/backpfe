package com.supportportal.Service;

import java.util.List;

import com.supportportal.Module.Stage;

public interface StageService {

    List<Stage> getAllStages();

    Stage getStageById(Long idStage);

    Stage saveStage(Stage stage);

    void deleteStage(Long idStage);
}