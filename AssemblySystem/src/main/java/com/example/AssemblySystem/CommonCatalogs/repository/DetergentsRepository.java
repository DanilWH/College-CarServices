package com.example.AssemblySystem.CommonCatalogs.repository;

import com.example.AssemblySystem.CommonCatalogs.domain.Detergents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetergentsRepository extends JpaRepository<Detergents, Long> {
}
