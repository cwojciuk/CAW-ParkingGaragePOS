
package caw.parkinggaragepos;

import java.util.Calendar;

/**
 *
 * @author cwojciuk
 */
public class Startup {

    
    public static void main(String[] args) {
        Company bestValue = new Company("Best Value", new FeeBestValueCalculator());
        ParkingGarage pg1 = new ParkingGarage(40,bestValue);
        ParkingGarageRegister pgr = new ParkingGarageRegister(pg1);
        
        pgr.EnterNewVehicle(Calendar.getInstance());
        pgr.EnterNewVehicle(Calendar.getInstance());
        pgr.EnterNewVehicle(Calendar.getInstance());
        pgr.EnterNewVehicle(Calendar.getInstance());
        pgr.EnterNewVehicle(Calendar.getInstance());
    }
}
