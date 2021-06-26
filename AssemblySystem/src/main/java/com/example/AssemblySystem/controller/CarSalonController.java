package com.example.AssemblySystem.controller;

import com.example.AssemblySystem.CarSalon.domain.ExpensingNomenclature;
import com.example.AssemblySystem.CarSalon.domain.ReceivingNomenclature;
import com.example.AssemblySystem.CarSalon.repository.ExpensingNomenclatureRepository;
import com.example.AssemblySystem.CarSalon.repository.ReceivingNomenclatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/car-salon")
public class CarSalonController {

    @Autowired
    private ReceivingNomenclatureRepository receivingNomenclatureRepository;
    @Autowired
    private ExpensingNomenclatureRepository expensingNomenclatureRepository;

    @GetMapping
    public String index() {
        return "car_salon/index";
    }

    @GetMapping("/receiving-nomenclature")
    public String showReceivingNomenclature(
            Model model
    ) {
        List<ReceivingNomenclature> receivingNomenclatureList = this.receivingNomenclatureRepository.findAll();
        model.addAttribute("receivingNomenclatureList", receivingNomenclatureList);

        return "car_salon/receiving_nomenclature";
    }

    @GetMapping("/expensing-nomenclature")
    public String showExpensingNomenclature(
            Model model
    ) {
        List<ExpensingNomenclature> expensingNomenclatureList = this.expensingNomenclatureRepository.findAll();
        model.addAttribute("expensingNomenclatureList", expensingNomenclatureList);

        return "car_salon/expensing_nomenclature";
    }
}
