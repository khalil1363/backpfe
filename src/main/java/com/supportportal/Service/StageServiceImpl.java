package com.supportportal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supportportal.Module.Stage;
import com.supportportal.Repository.StageRepository;

@Service
public class StageServiceImpl implements StageService {

    @Autowired
    private StageRepository stageRepository;

    @Override
    public List<Stage> getAllStages() {
        return stageRepository.findAll();
    }

    @Override
    public Stage getStageById(Long idStage) {
        return stageRepository.findById(idStage).orElse(null);
    }

    @Override
    public Stage saveStage(Stage stage) {
        return stageRepository.save(stage);
    }

    @Override
    public void deleteStage(Long idStage) {
        stageRepository.deleteById(idStage);
    }
}