package com.system;

public class FullTimeEmployeeTaxCalculationImpl extends EmployeeTaxCalculationImpl{

    @Override
    public long calculateTax(long salary){
        return salary*35/100;
    }
}
