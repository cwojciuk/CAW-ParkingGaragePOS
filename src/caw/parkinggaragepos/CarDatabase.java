package caw.parkinggaragepos;

import java.util.ArrayList;
import java.util.List;

public class CarDatabase {
    List<Car> ParkedCars = new ArrayList();
    
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
    
}
