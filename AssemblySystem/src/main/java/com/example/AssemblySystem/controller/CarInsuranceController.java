package com.example.AssemblySystem.controller;

import com.example.AssemblySystem.CarInsurance.domain.Payment;
import com.example.AssemblySystem.CarInsurance.domain.Payout;
import com.example.AssemblySystem.CarInsurance.repository.PaymentRepository;
import com.example.AssemblySystem.CarInsurance.repository.PayoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/car-insurance")
public class CarInsuranceController {

    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private PayoutRepository payoutRepository;

    @GetMapping
    public String index() {
        return "car_insurance/index";
    }

    @GetMapping("/payment")
    public String showPayment(
            Model model
    ) {
        List<Payment> paymentList = this.paymentRepository.findAll();
        model.addAttribute("paymentList", paymentList);

        return "car_insurance/payment";
    }

    @GetMapping("/payout")
    public String showPayout(
            Model model
    ) {
        List<Payout> payoutList = this.payoutRepository.findAll();
        model.addAttribute("payoutList", payoutList);

        return "car_insurance/payout";
    }
}
