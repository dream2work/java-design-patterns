package com.dream2work.structural.adapter;

public class EmployeeObjectAdapter implements Customer {
    Employee adaptee;

    public EmployeeObjectAdapter(Employee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public String getName() {
        return adaptee.getFullName();
    }

    @Override
    public String getAddress() {
        return adaptee.getOfficeAddress();
    }
}
