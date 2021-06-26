package com.example.AssemblySystem.CarMarket.repository;

import com.example.AssemblySystem.CarMarket.domain.Coming;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComingRepository extends JpaRepository<Coming, Long> {
}
