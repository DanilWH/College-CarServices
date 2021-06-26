package com.example.AssemblySystem.CarService.repository;

import com.example.AssemblySystem.CarService.domain.ExpensingWaybill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpensingWaybillRepository extends JpaRepository<ExpensingWaybill, Long> {
}
