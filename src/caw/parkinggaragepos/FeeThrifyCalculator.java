package caw.parkinggaragepos;

/**
 * caw.parkinggaragepos\FeeThriftyCalculator.java
 * Oct 17, 2012 1:44:04 PM
 * Advanced Java Programming 152-135-10442-13
 * @author Charles Wojciuk
 */

public class FeeThrifyCalculator implements FeeParkedCarCalculatorStrategy{

    private final int ZERO = 0;
    private final String INVALIDPARKHOURS = "Car parked outside of allotted time.";
    private final String ZEROHOUR = "Car must be parked for more than 0 hours";
    
    private double minimumFee = 1.50;
    private double minimumFeeHours = 2;
    private double chargePerAdditionalTime = .75;
    private double maximumCharge = -1;
    private int maximumParkTime = 24;
    private int fee;
    
    @Override
    public double getParkingFee(double hoursParked) {
        if(hoursParked != ZERO){
        
            if(hoursParked<=maximumParkTime){
                
                if(hoursParked<=minimumFeeHours){
                    return minimumFee;
                    
                }else{
                    fee += minimumFee;
                    for(int i = ZERO;(i-(hoursParked-minimumFeeHours))>ZERO;i++){
                        fee += chargePerAdditionalTime;
                    }
                    if(fee > maximumCharge){
                        return maximumCharge;
                    }else{
                        return fee;
                    }
                }
            }else{
                throw new IllegalArgumentException(INVALIDPARKHOURS);
            }
        }else{
            throw new IllegalArgumentException(ZEROHOUR);
        }
    }
}
    

