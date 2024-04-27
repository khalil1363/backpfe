package com.supportportal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supportportal.Module.Stage;

public interface StageRepository extends JpaRepository<Stage, Long> {
}
