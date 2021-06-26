package com.example.AssemblySystem.CarSalon.repository;

import com.example.AssemblySystem.CarSalon.domain.ExpensingNomenclature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpensingNomenclatureRepository extends JpaRepository<ExpensingNomenclature, Long> {
}
