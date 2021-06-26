package com.example.AssemblySystem.CarWash.repository;

import com.example.AssemblySystem.CarWash.domain.CarWashExpensingWaybill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarWashExpensingWaybillRepository extends JpaRepository<CarWashExpensingWaybill, Long> {
}
