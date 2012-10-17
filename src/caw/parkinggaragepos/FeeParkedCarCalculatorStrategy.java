/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caw.parkinggaragepos;

/**
 *
 * @author cwojciuk
 */
public interface FeeParkedCarCalculatorStrategy {
    public abstract double getParkingFee(int hoursParked);
}
