package com.supportportal.Service;

import java.util.List;

import com.supportportal.Module.Stagier;

public interface StagierService {

    List<Stagier> getAllStagiers();

    Stagier getStagierById(Long idStagier);

    Stagier saveStagier(Stagier stagier);

    void deleteStagier(Long idStagier);
}