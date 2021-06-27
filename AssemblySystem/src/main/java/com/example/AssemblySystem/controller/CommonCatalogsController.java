package com.example.AssemblySystem.controller;

import com.example.AssemblySystem.CommonCatalogs.domain.CarBrands;
import com.example.AssemblySystem.CommonCatalogs.domain.Detergents;
import com.example.AssemblySystem.CommonCatalogs.repository.CarBrandsRepository;
import com.example.AssemblySystem.CommonCatalogs.repository.DetergentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/common-catalogs")
public class CommonCatalogsController {

    @Autowired
    private CarBrandsRepository carBrandsRepository;
    @Autowired
    private DetergentsRepository detergentsRepository;

    @GetMapping
    public String index() {
        return "common_catalogs/index";
    }

    @GetMapping("/car-brands")
    public String showCarBrands(
            Model model
    ) {
        List<CarBrands> carBrandsList = this.carBrandsRepository.findAll();
        model.addAttribute("carBrandsList", carBrandsList);

        return "common_catalogs/car_brands";
    }

    @GetMapping("/detergents")
    public String showDetergents(
            Model model
    ) {
        List<Detergents> detergentsList = this.detergentsRepository.findAll();
        model.addAttribute("detergentsList", detergentsList);

        return "common_catalogs/detergents";
    }
}
