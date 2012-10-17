/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caw.parkinggaragepos;

/**
 *
 * @author cwojciuk
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
    private int fee;
    
    @Override
    public double getParkingFee(int hoursParked) {
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
