/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uber;
class UberX2 extends Car {
    String brand;
    String model;

    public UberX2(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;

    }
    
 
    @Override
    void printDataCar(){
    	super.printDataCar();
        System.out.println("Modelo: " + model + " Brand: " + brand);

    }
}