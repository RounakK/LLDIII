package com.system;

public class PartTimeEmployeeTaxCalculation extends EmployeeTaxCalculationImpl{
    @Override
    public long calculateTax(long salary){
        return salary*27/100;
    }
}
