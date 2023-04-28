package com.example;

public class Dealership {
    public static void main(String[] args) {

        Customer cust1 = new Customer("Tom", "Giannitsa", 12000);

        Vehicle vehicle = new Vehicle("Honda", "Whatever", 10000);
        
        Employee emp = new Employee();

        cust1.purchaseCar(vehicle, emp, false);
    }
}
