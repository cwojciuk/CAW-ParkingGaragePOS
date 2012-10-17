/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caw.parkinggaragepos;

import java.util.Calendar;

/**
 *
 * @author cwojciuk
 */
public class Car {
    private Calendar enterDate;
    private int carID;
    public Car(Calendar enterDate, int carID) {
        enterGarage(enterDate);
    }
    public final void enterGarage(Calendar enterDate){
        this.enterDate = enterDate;
    }
    
   public final Calendar getEnterDate(){
        return enterDate;
    }
    

    public final int getCarID() {
        return carID;
    }

    public final void setCarID(int carID) {
        this.carID = carID;
    }
    
}
