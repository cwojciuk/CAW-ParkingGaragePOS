package caw.parkinggaragepos;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * caw.parkinggaragepos\Receipt.java
 * Oct 17, 2012 1:44:04 PM
 * Advanced Java Programming 152-135-10442-13
 * @author Charles Wojciuk
 */

public class Receipt {
    
    private static final String NOCAR = "Car Unavailable for checkout.";

    private ParkingGarage pg;
    private ReceiptOutputStrategy output = new ReceiptConsoleOutput();
    private double receiptTotal;
    

    public Receipt(int carID, FeeParkedCarCalculatorStrategy fpccs, ParkingGarage pg) {
        if(pg!=null){
            this.pg = pg;
            if(pg.findCar(carID) != null){
                Car c = queryLeavingCar(carID);
                receiptTotal = fpccs.getParkingFee(c.getTimeInGarage());
                pg.addToTotalHours(c.getTimeInGarage());
                pg.addToTotalEarned(receiptTotal);
                outputReceipt(c,fpccs);
            }else{
                throw new IllegalArgumentException(NOCAR);
            }
        }
    }
    
    private Car queryLeavingCar(int carID) {
        // needs validation
        return pg.findCar(carID);
    }    
    
    public final void outputReceipt(Car c, FeeParkedCarCalculatorStrategy fpccs) {
        DecimalFormat df = new DecimalFormat("#.##");
        output.outputReceipt("Receipt for a car id "+c.getCarID()+": "
                +c.getTimeInGarage()+" hours parked, fee charged: "
                +NumberFormat.getCurrencyInstance().format(receiptTotal) + "\n"
                +"Totals for Garage: " 
                + df.format(pg.getTotalHours())+" hours charged, " 
                +NumberFormat.getCurrencyInstance().format(pg.getTotalEarned())
                +" collected.\n");
    }
}
