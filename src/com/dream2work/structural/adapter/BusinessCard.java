package com.dream2work.structural.adapter;

public class BusinessCard {
    public String designCard(Customer customer) {
        return "***" +
               " Name = " + customer.getName() +
               "; Address = " + customer.getAddress();
    }
}
