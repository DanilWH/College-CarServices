package com.example.AssemblySystem.CarWash.repository;

import com.example.AssemblySystem.CarWash.domain.CarWashReceivingWaybill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarWashReceivingWaybillRepository extends JpaRepository<CarWashReceivingWaybill, Long> {
}
