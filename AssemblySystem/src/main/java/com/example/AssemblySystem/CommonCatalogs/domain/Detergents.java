package com.example.AssemblySystem.CommonCatalogs.domain;

import javax.persistence.*;

@Entity
@Table(name = "detergents")
public class Detergents {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "detergent_name")
    private String detergentName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetergentName() {
        return detergentName;
    }

    public void setDetergentName(String detergentName) {
        this.detergentName = detergentName;
    }
}
