package caw.parkinggaragepos;

/**
 * caw.parkinggaragepos\FeeDefaultCalculator.java
 * Oct 17, 2012 1:44:04 PM
 * Advanced Java Programming 152-135-10442-13
 * @author Charles Wojciuk
 */

public class FeeParkedCarCalculatorService {
    private FeeParkedCarCalculatorStrategy fpccs;
    
    public FeeParkedCarCalculatorService(FeeParkedCarCalculatorStrategy fpccs){
        this.fpccs = fpccs;
    }
    
    public final double getDiscount(double hoursParked){
        return fpccs.getParkingFee(hoursParked);
    }
}
