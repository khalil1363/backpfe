package com.supportportal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supportportal.Module.Stagier;
import com.supportportal.Repository.StagierRepository;

@Service
public class StagierServiceImpl implements StagierService {

    @Autowired
    private StagierRepository stagierRepository;

    @Override
    public List<Stagier> getAllStagiers() {
        return stagierRepository.findAll();
    }

    @Override
    public Stagier getStagierById(Long idStagier) {
        return stagierRepository.findById(idStagier).orElse(null);
    }

    @Override
    public Stagier saveStagier(Stagier stagier) {
        return stagierRepository.save(stagier);
    }

    @Override
    public void deleteStagier(Long idStagier) {
        stagierRepository.deleteById(idStagier);
    }
}