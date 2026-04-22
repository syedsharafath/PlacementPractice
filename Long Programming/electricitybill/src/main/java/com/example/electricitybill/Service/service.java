package com.example.electricitybill.Service;

import com.example.electricitybill.Model.Bill;

import org.springframework.stereotype.Service;

@Service
public class service {

    public Bill calculate(Bill bill){
System.out.println("processing bill"+bill.getName());
        int units=bill.getUnits();
        double amt=0;
        if(units<=100){
            amt=units*1.5;

        }else if(units<=200){
            amt=(100*1.5)+(units-100)*2.5;
        }
        else if(units<=300){
            amt=(100*1.5)+(100*2.5)+(units-200)*4;
        }
        else{
            amt=(100*1.5)+(100*2.5)+(100*4)+(units-300)*6;
        }
        bill.setAmt(amt);

            return bill;

    }
}
