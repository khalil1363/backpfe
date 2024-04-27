package com.supportportal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supportportal.Module.Candidat;

public interface CandidatRepository extends JpaRepository<Candidat, Long> {
	
}