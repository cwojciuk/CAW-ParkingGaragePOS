package caw.parkinggaragepos;

import java.text.DecimalFormat;
import java.text.Format;

/**
 * caw.parkinggaragepos\Receipt.java
 * Oct 17, 2012 1:44:04 PM
 * Advanced Java Programming 152-135-10442-13
 * @author Charles Wojciuk
 */

public class Receipt {
    
    private static final String NOCAR = "Car Unavailable for checkout.";

    private CarDatabase database;
    private ReceiptOutputStrategy output = new ReceiptConsoleOutput();
    

    public Receipt(int carID, FeeParkedCarCalculatorStrategy fpccs, CarDatabase carDatabase) {
        if(carDatabase!=null){
            this.database = carDatabase;
            if(database.findCar(carID) != null){
                Car c = queryLeavingCar(carID);
                outputReceipt(c,fpccs);
            }else{
                throw new IllegalArgumentException(NOCAR);
            }
        }
    }
    
    private Car queryLeavingCar(int carID) {
        // needs validation
        return database.findCar(carID);
    }    
    
    public final void outputReceipt(Car c, FeeParkedCarCalculatorStrategy fpccs) {
        DecimalFormat df = new DecimalFormat("#.##");
        output.outputReceipt("Receipt for a car id "+c.getCarID()+": "
                +c.getTimeInGarage()+" hours parked, fee charged: "
                +fpccs.getParkingFee(c.getTimeInGarage()) + "\n"
                +"Totals for Garage: " + database.getTotalHours()
                +" hours charged, $" + df.format(database.getTotalEarned())
                +" collected.");
    }
}
