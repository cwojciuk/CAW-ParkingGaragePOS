package caw.parkinggaragepos;

/**
 * caw.parkinggaragepos\FeeBestValueCalculator.java
 * Oct 17, 2012 1:44:04 PM
 * Advanced Java Programming 152-135-10442-13
 * @author Charles Wojciuk
 */

public class FeeBestValueCalculator implements FeeParkedCarCalculatorStrategy{
    private final int ZERO = 0;
    private final String INVALIDPARKHOURS = "Car parked outside of allotted time.";
    private final String ZEROHOUR = "Car must be parked for more than 0 hours";
    
    private double minimumFee = 2.00;
    private double minimumFeeHours = 3;
    private double chargePerAdditionalTime = .50;
    private double maximumCharge = 10.00;
    private int maximumParkTime = 24;
    
    
    @Override
    public double getParkingFee(double hoursParked) {
        double fee = 0;
        if(hoursParked != ZERO){
        
            if(hoursParked<=maximumParkTime){
                
                if(hoursParked<=minimumFeeHours){
                    return minimumFee;
                    
                }else{
                    fee += minimumFee;
                    for(int i = 0;((Math.ceil(hoursParked-minimumFeeHours))-i)>=0;i++){
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
