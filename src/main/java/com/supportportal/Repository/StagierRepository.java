package com.supportportal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supportportal.Module.Stagier;

public interface StagierRepository extends JpaRepository<Stagier, Long> {
}