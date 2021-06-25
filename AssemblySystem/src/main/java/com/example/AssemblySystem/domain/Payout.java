package com.example.AssemblySystem.domain;

import javax.persistence.*;

@Entity
@Table(name = "payout")
public class Payout {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "car_brand")
    private String carBrand;

    @Column(name = "payout_amount")
    private Double payoutAmount;

    @Column(name = "payout_unit")
    private String payoutUnit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Double getPayoutAmount() {
        return payoutAmount;
    }

    public void setPayoutAmount(Double payoutAmount) {
        this.payoutAmount = payoutAmount;
    }

    public String getPayoutUnit() {
        return payoutUnit;
    }

    public void setPayoutUnit(String payoutUnit) {
        this.payoutUnit = payoutUnit;
    }
}
