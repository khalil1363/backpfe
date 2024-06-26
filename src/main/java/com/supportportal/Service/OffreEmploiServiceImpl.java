package com.supportportal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supportportal.Module.OffreEmploi;
import com.supportportal.Repository.OffreEmploiRepository;

@Service
public class OffreEmploiServiceImpl implements OffreEmploiService {

    @Autowired
    private OffreEmploiRepository offreEmploiRepository;

    @Override
    public List<OffreEmploi> getAllOffresEmploi() {
        return offreEmploiRepository.findAll();
    }

    @Override
    public OffreEmploi getOffreEmploiById(Long idOffreEmploi) {
        return offreEmploiRepository.findById(idOffreEmploi).orElse(null);
    }

    @Override
    public OffreEmploi saveOffreEmploi(OffreEmploi offreEmploi) {
        return offreEmploiRepository.save(offreEmploi);
    }

    @Override
    public void deleteOffreEmploi(Long idOffreEmploi) {
        offreEmploiRepository.deleteById(idOffreEmploi);
    }
}