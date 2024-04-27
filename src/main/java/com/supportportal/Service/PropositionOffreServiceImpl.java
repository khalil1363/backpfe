package com.supportportal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supportportal.Module.PropositionOffre;
import com.supportportal.Repository.PropositionOffreRepository;

@Service
public class PropositionOffreServiceImpl implements PropositionOffreService {

  @Autowired
  private PropositionOffreRepository propositionOffreRepository;

  @Override
  public PropositionOffre savePropositionOffre(PropositionOffre propositionOffre) {
    return propositionOffreRepository.save(propositionOffre);
  }

  @Override
  public List<PropositionOffre> getAllPropositionOffres() {
    return propositionOffreRepository.findAll();
  }

  @Override
  public PropositionOffre getPropositionOffreById(Long id) {
    return propositionOffreRepository.findById(id).get();
  }

  @Override
  public void deletePropositionOffre(Long id) {
    propositionOffreRepository.deleteById(id);
  }

  @Override
  public PropositionOffre updatePropositionOffre(PropositionOffre propositionOffre) {
  
    PropositionOffre existingProposition = propositionOffreRepository.findById(propositionOffre.getIdOffreProp()).get();

    existingProposition.setDepartement(propositionOffre.getDepartement());
    existingProposition.setJobTitre(propositionOffre.getJobTitre());

    return propositionOffreRepository.save(existingProposition);
  }



}