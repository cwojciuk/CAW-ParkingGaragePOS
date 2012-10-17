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
    
    public final void endCarStayAndOutputReceipt(Car c) {
        
        receipt.outputReceipt(c);
        
    }
    
    
    public final void EnterNewVehicle(double stayedTime, int carID) {
        Car c = new Car(stayedTime,carID);
        pg.addCar(c);
    }       
}
    /*
    * Contains implementation for a more robust Car object that relies on
    * generated time stamps instead of a time generated by a register object.
    * The car would receive a time stamp upon entering and then reference a
    * time stamp when leaving to commit a total time and perform the
    * calculations for the cost.
    * 
    */
    //public final void EnterNewVehicle(Calendar enterTime, int carID) {
        //Would use this method so no two cars would get the same ID
        //by auto assigning a carID 
        //Car c = new Car(enterTime, pg.getNextCarID());
        //pg.addCar(c);
    //}
    //public final void endCarStayAndOutputReceipt(Calendar exit, int carID) {
        //        
        //receipt.outputReceipt(exit);
        //        
    //}