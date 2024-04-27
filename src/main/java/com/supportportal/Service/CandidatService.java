package com.supportportal.Service;

import java.util.List;

import com.supportportal.Module.Candidat;

public interface CandidatService {

    List<Candidat> getAllCandidats();

    Candidat getCandidatById(Long idCandidats);

    Candidat saveCandidat(Candidat candidat);

    void deleteCandidat(Long idCandidats);
}
