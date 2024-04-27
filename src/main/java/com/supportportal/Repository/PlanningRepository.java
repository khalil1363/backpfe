package com.supportportal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supportportal.Module.Planning;

public interface PlanningRepository extends JpaRepository<Planning, Long> {
}
