package caw.parkinggaragepos;

/**
 * caw.parkinggaragepos\CarDatabase.java
 * Oct 17, 2012 1:44:04 PM
 * Advanced Java Programming 152-135-10442-13
 * @author Charles Wojciuk
 */

//import java.util.Calendar;

public class Startup {

    
    public static void main(String[] args) {
        Company bestValue = new Company("Best Value", new FeeBestValueCalculator());
        ParkingGarage pg1 = new ParkingGarage(40,bestValue);
        ParkingGarageRegister pgr = new ParkingGarageRegister(pg1);
        
        //Would call these methods using Calendar instances
        //Given the use of the timestamp strategy.
        pgr.EnterNewVehicle(6.5,1);
        pgr.EnterNewVehicle(4.2,2);
        pgr.EnterNewVehicle(9,3);
        pgr.EnterNewVehicle(22.4,4);
        pgr.EnterNewVehicle(15.9,5);
        
        pgr.endCarStayAndOutputReceipt(100);
        //pgr.endCarStayAndOutputReceipt(101);
    }
}
