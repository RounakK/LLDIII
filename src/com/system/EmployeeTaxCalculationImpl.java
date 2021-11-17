package com.system;

public class EmployeeTaxCalculationImpl implements EmployeeTaxCalculation {

    @Override
    public long calculateTax(long salary){
        return salary*23/100;
    }
}
