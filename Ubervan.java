/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uber;
import java.util.ArrayList;
import java.util.Map;

class Ubervan extends Car{
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;

    public Ubervan(String license, Account driver){
        super(license, driver);
    }
    
   
   public void setPassenger(Integer passenger) {
       if(passenger == 6){
           this.passenger = passenger;
       }
       else{
           System.out.println("Necesitas asignar 6 pasajeros");
       }
   }
   
 
   void printDataCar(){
       System.out.println("License: " + license + " Driver: " + driver.name + " Passenger: " + passenger);

   }
   
}