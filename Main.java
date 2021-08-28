/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uber;


class Main {
    
    public static void main(String[] args) {
        UberX2 uberX = new UberX2("AMQ123", new Account("Jeyfred Calderon", "JCC1004"), "Chevrolet", "Spark");
        uberX.setPassenger(4);
        uberX.printDataCar();
        
         
        Ubervan uberVan = new Ubervan("FGH456", new Account("Andres Herrera", "AND123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}