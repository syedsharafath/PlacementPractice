package com.example.electricitybill.Controller;

import com.example.electricitybill.Model.Bill;
import com.example.electricitybill.Service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {
    @Autowired
    private service s;
    @GetMapping("/h")
    public String hello(){
        return "Electricity Billing is running";
    }
    @PostMapping("/cal")
    public Bill cal(@RequestBody Bill bill){
        return s.calculate(bill);

    }

}
