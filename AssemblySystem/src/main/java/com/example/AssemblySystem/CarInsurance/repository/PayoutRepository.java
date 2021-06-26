package com.example.AssemblySystem.CarInsurance.repository;

import com.example.AssemblySystem.CarInsurance.domain.Payout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayoutRepository extends JpaRepository<Payout, Long>  {
}
