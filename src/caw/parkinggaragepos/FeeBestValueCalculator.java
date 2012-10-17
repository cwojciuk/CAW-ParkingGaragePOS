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
    private double minimumFee = 2.00;
    private double minimumFeeHours = 3;
    private double chargePerAdditionalTime = .50;
    private double maximumCharge = 10.00;
    private int maximumParkTime = 24;
    
    @Override
    public double getParkingFee(int hoursParked) {
        if(hoursParked<=maximumParkTime){
            return 
        }
    }
    
}
