package com.example.AssemblySystem.controller;

import com.example.AssemblySystem.CarWash.domain.CarWashExpensingWaybill;
import com.example.AssemblySystem.CarWash.domain.CarWashReceivingWaybill;
import com.example.AssemblySystem.CarWash.repository.CarWashExpensingWaybillRepository;
import com.example.AssemblySystem.CarWash.repository.CarWashReceivingWaybillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/car-wash")
public class CarWashController {

    @Autowired
    private CarWashReceivingWaybillRepository carWashReceivingWaybillRepository;
    @Autowired
    private CarWashExpensingWaybillRepository carWashExpensingWaybillRepository;

    @GetMapping
    public String index() {
        return "car_wash/index";
    }

    @GetMapping("/car-wash-receiving-waybill")
    public String showCarWashReceivingWaybill(
            Model model
    ) {
        List<CarWashReceivingWaybill> carWashReceivingWaybillList = this.carWashReceivingWaybillRepository.findAll();
        model.addAttribute("carWashReceivingWaybillList", carWashReceivingWaybillList);

        return "car_wash/car_wash_receiving_waybill";
    }

    @GetMapping("/car-wash-expensing-waybill")
    public String showCarWashExpensingWaybill(
            Model model
    ) {
        List<CarWashExpensingWaybill> carWashExpensingWaybillList = this.carWashExpensingWaybillRepository.findAll();
        model.addAttribute("carWashExpensingWaybillList", carWashExpensingWaybillList);

        return "car_wash/car_wash_expensing_waybill";
    }
}
