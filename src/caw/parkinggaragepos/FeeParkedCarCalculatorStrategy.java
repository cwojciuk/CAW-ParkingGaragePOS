package caw.parkinggaragepos;

/**
 * caw.parkinggaragepos\FeeParkedCarCalculatorStrategy.java
 * Oct 17, 2012 1:44:04 PM
 * Advanced Java Programming 152-135-10442-13
 * @author Charles Wojciuk
 */
public interface FeeParkedCarCalculatorStrategy {
    public abstract double getParkingFee(double hoursParked);
}
