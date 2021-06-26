package com.example.AssemblySystem.CarSalon.repository;

import com.example.AssemblySystem.CarSalon.domain.ReceivingNomenclature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceivingNomenclatureRepository extends JpaRepository<ReceivingNomenclature, Long> {
}
