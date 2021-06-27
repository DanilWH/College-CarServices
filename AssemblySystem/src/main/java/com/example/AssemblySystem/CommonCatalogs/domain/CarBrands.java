package com.example.AssemblySystem.CommonCatalogs.domain;

import javax.persistence.*;

@Entity
@Table(name = "car_brands")
public class CarBrands {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "brand")
    private String brand;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
