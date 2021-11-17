package com.system;

public class InternTaxCalculationImpl extends EmployeeTaxCalculationImpl{
    @Override
    public long calculateTax(long salary){
        return salary*20/100;
    }
}
