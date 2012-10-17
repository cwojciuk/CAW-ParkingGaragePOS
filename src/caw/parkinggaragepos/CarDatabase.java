package caw.parkinggaragepos;

import java.util.ArrayList;
import java.util.List;

public class CarDatabase {
    private double totalHours = 0;
    private double totalEarned = 0;
    private int totalCarsParked = 0;
    
    private List<Car> ParkedCars = new ArrayList();
    
    public final void addCar(Car c){
        if(c != null){
            ParkedCars.add(c);
        }else{
            throw new IllegalArgumentException("Car cannot be null");
        }
    }
    
    public final void removeCar(Car c){
        ParkedCars.remove(c);
    }
    
    public final Car findCar(int carID){
         
        // validation is needed
        Car car = null;
        for(Car c : ParkedCars) {
            if(carID == c.getCarID()) {
                car = c;
                break;
            }
        }
        
        return car;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public final void addToTotalHours(double totalHours) {
        if(totalHours!=0){
            this.totalHours += totalHours;
        }
    }

    public final double getTotalEarned() {
        return totalEarned;
    }

    public final void addToTotalEarned(double totalEarned) {
        if(totalEarned!=0){
            this.totalEarned += totalEarned;
        }
    }

    public final int getTotalCarsParked() {
        return totalCarsParked;
    }

    /**
     * Adds one to the total cars value represents the
     * total number of cars that have ever used the
     * parking garage.
     */
    public final void addOneToTotalCarsParked() {
        totalCarsParked++;
    }
    
    
    
}
