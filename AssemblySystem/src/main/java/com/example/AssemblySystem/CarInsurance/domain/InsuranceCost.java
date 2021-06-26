package com.example.AssemblySystem.CarInsurance.domain;

import javax.persistence.*;

@Entity
@Table(name = "insurance_cost")
public class InsuranceCost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cost")
    private Integer cost;

    @Column(name = "driving_age")
    private Integer drivingAge;

    @Column(name = "accident_number")
    private Integer accidentNumber;

    @Column(name = "carsalon_income")
    private Integer carsalonIncome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getDrivingAge() {
        return drivingAge;
    }

    public void setDrivingAge(Integer drivingAge) {
        this.drivingAge = drivingAge;
    }

    public Integer getAccidentNumber() {
        return accidentNumber;
    }

    public void setAccidentNumber(Integer accidentNumber) {
        this.accidentNumber = accidentNumber;
    }

    public Integer getCarsalonIncome() {
        return carsalonIncome;
    }

    public void setCarsalonIncome(Integer carsalonIncome) {
        this.carsalonIncome = carsalonIncome;
    }
}
