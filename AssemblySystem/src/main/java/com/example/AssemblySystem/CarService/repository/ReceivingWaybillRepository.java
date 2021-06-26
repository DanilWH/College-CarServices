package com.example.AssemblySystem.CarService.repository;

import com.example.AssemblySystem.CarService.domain.ReceivingWaybill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceivingWaybillRepository extends JpaRepository<ReceivingWaybill, Long> {
}
