/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caw.parkinggaragepos;

import java.util.Calendar;


/**
 *
 * @author Charles Wojciuk
 */
public class Receipt {
    
    private static final String NOCAR = "Car Unavailable for checkout.";
    private Car car;
    private CarDatabase database;
    private ReceiptOutputStrategy output;

    public Receipt(int carID, ReceiptOutputStrategy ros) {
        if(database.findCar(carID) != null){
            this.car = queryLeavingCar(carID);
        }else{
            throw new IllegalArgumentException(NOCAR);
        }
    }
    
    private Car queryLeavingCar(int carID) {
        // needs validation
        return database.findCar(carID);
    }    
    
    public final void outputReceipt(Car c) {
        output.outputReceipt("My receipt");
    }
}
