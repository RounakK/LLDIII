package com.system;

public class Employee {

    protected String id;
    protected String name;
    protected String email;
    protected long salary;
    protected Type type;



    public long calculateTax(EmployeeTaxCalculation employeeTaxCalculation){
        return employeeTaxCalculation.calculateTax(salary);
    }


    public Employee(String id, String name, String email, Type type){
        this.id = id;
        this.name = name;
        this.email = email;
        this.type = type;
    }


    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

   
}
