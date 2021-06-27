package com.example.AssemblySystem.CommonCatalogs.repository;

import com.example.AssemblySystem.CommonCatalogs.domain.CarBrands;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarBrandsRepository extends JpaRepository<CarBrands, Long> {
}
