package com.example.AssemblySystem.CarInsurance.repository;

import com.example.AssemblySystem.CarInsurance.domain.InsuranceCost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceCostRepository extends JpaRepository<InsuranceCost, Long> {
}
