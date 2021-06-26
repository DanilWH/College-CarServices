package com.example.AssemblySystem.controller;

import com.example.AssemblySystem.CarMarket.domain.Coming;
import com.example.AssemblySystem.CarMarket.domain.Sale;
import com.example.AssemblySystem.CarMarket.repository.ComingRepository;
import com.example.AssemblySystem.CarMarket.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/car-market")
public class CarMarketController {

    @Autowired
    private ComingRepository comingRepository;
    @Autowired
    private SaleRepository saleRepository;

    @GetMapping
    public String index() {
        return "car_market/index";
    }

    @GetMapping("/coming")
    public String showComing(
            Model model
    ) {
        List<Coming> comingList = this.comingRepository.findAll();
        model.addAttribute("comingList", comingList);

        return "car_market/coming";
    }

    @GetMapping("/sale")
    public String showSale(
            Model model
    ) {
        List<Sale> saleList = this.saleRepository.findAll();
        model.addAttribute("saleList", saleList);

        return "car_market/sale";
    }
}
