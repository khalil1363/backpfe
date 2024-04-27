package com.supportportal.Service;

import java.util.List;

import com.supportportal.Module.OffreEmploi;

public interface OffreEmploiService {

    List<OffreEmploi> getAllOffresEmploi();

    OffreEmploi getOffreEmploiById(Long idOffreEmploi);

    OffreEmploi saveOffreEmploi(OffreEmploi offreEmploi);

    void deleteOffreEmploi(Long idOffreEmploi);
}