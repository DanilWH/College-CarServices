package com.example.AssemblySystem.controller;

import com.example.AssemblySystem.CarService.domain.ExpensingWaybill;
import com.example.AssemblySystem.CarService.domain.ReceivingWaybill;
import com.example.AssemblySystem.CarService.repository.ExpensingWaybillRepository;
import com.example.AssemblySystem.CarService.repository.ReceivingWaybillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/car-service")
public class CarServiceController {

    @Autowired
    private ReceivingWaybillRepository receivingWaybillRepository;
    @Autowired
    private ExpensingWaybillRepository expensingWaybillRepository;

    @GetMapping
    public String index() {
        return "car_service/index";
    }

    @GetMapping("/receiving-waybill")
    public String showReceivingWaybill(
            Model model
    ) {
        List<ReceivingWaybill> receivingWaybillList = this.receivingWaybillRepository.findAll();
        model.addAttribute("receivingWaybillList", receivingWaybillList);

        return "car_service/receiving_waybill";
    }

    @GetMapping("/expensing-waybill")
    public String showExpensingWaybill(
            Model model
    ) {
        List<ExpensingWaybill> expensingWaybillList = this.expensingWaybillRepository.findAll();
        model.addAttribute("expensingWaybillList", expensingWaybillList);

        return "car_service/expensing_waybill";
    }
}
