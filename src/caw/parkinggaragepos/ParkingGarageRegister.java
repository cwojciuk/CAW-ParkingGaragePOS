/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caw.parkinggaragepos;

import java.util.Calendar;

/**
 *
 * @author CWojciuk
 */
public class ParkingGarageRegister {
    private final String NULLEXCEPTION = "Parking Garage Cannot Be Null";
    
    private ParkingGarage pg;
    private Receipt receipt;
    
    public ParkingGarageRegister(ParkingGarage pg){
        setParkingGarage(pg);
    }
    
    public final void setParkingGarage(ParkingGarage pg){
        if(pg != null){
            this.pg = pg;
        }else{
            throw new IllegalArgumentException(NULLEXCEPTION);
        }
    }
    
    public final void endCarStayAndOutputReceipt(Calendar exit, int carID) {
        
        receipt.outputReceipt(exit);
        
    }
    
    public final void EnterNewVehicle(Calendar enterTime) {
        Car c = new Car(enterTime, pg.getNextCarID());
        pg.addCar(c);
    }
    
}
