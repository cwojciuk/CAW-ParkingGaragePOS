package caw.parkinggaragepos;

/**
 * caw.parkinggaragepos\CarDatabase.java
 * Oct 17, 2012 1:44:04 PM
 * Advanced Java Programming 152-135-10442-13
 * @author Charles Wojciuk
 */

import java.util.ArrayList;
import java.util.List;
/*
 * This class is a "fake" database that represents the functionality of a
 * real database. Holds information as well as having methods to find, add,
 * and remove a value from the "table" Parked Cars.
 */
public class CarDatabase {
    private final String CARNULL = "Car cannot be null";
    
    private double totalHours = 0;
    private double totalEarned = 0;
    private int totalCarsParked = 0;
    
    private List<Car> ParkedCars = new ArrayList();
    
    /**
     * Adds a car to the fake database table ParkedCars.
     * Car c contains the timeParked and CarID.
     * Throws a exception if a null car is passed, however there is also
     * a check in the parkingGarage class that also will not allow a
     * null Car to be passed.
     * @param c 
     */
    public final void addCar(Car c){
        if(c != null){
            ParkedCars.add(c);
            
        }else{
            throw new IllegalArgumentException(CARNULL);
        }
    }
    /**
     * Finds a car object inside of the fake database table parkedCars and
     * removes that instance from parkedCars.
     * @param c 
     */
    public final void removeCar(Car c){
        ParkedCars.remove(c);
    }
    /**
     * Used to find a car object inside the fake database table parkedCars
     * based on the carId of the car objects inside parkedCars. Uses a for
     * loop to compare the carID of every car in parkedCar to the provided
     * carID parameter.
     * @param carID
     * @return
     */
    public final Car findCar(int carID){
         
        // validation is needed
        Car car = null;
        
        for (int i = 0; i < ParkedCars.size(); i++) {
            if(ParkedCars.get(i).getCarID()==carID){
                car = ParkedCars.get(i);
            }
        }
        
        return car;
    }

    /**
     * Adds one to the total cars value represents the
     * total number of cars that have ever used the
     * parking garage.
     */
    public final void addOneToTotalCarsParked() {
        totalCarsParked++;
    }
    
    /**
     * Adds the amount of a receipt to the totalEarned value of the
     * fake database. Would normally be in another table with a relationship
     * to the parkedCar table based on carID.
     * @param receiptAmount 
     */
    public final void addToTotalEarned(double receiptAmount) {
        if(receiptAmount!=0){
            this.totalEarned += receiptAmount;
        }
    }
    
    /**
     * Adds the hours of a receipt to the totalHours value of the
     * fake database. Would normally be in another table with a relationship
     * to the parkedCar table based on carID.
     * @param receiptHours 
     */
    public final void addToTotalHours(double receiptHours) {
        if(receiptHours!=0){
            this.totalHours += receiptHours;
        }
    }
    /**
     * Returns the totalHours of a database object.
     * @return 
     */
    public final double getTotalHours() {
        return totalHours;
    }
    
    /**
     * Returns the totalEarned of a database object.
     * @return 
     */
    public final double getTotalEarned() {
        return totalEarned;
    }
    
    /**
     * Returns the totalCars of a database object.
     * @return
     */
    public final int getTotalCarsParked() {
        return totalCarsParked;
    }
}
