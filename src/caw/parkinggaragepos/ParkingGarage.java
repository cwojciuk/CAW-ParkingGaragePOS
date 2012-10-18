package caw.parkinggaragepos;

/**
 * caw.parkinggaragepos\ParkingGarage.java
 * Oct 17, 2012 1:44:04 PM
 * Advanced Java Programming 152-135-10442-13
 * @author Charles Wojciuk
 */

public class ParkingGarage {
    private static final String FULL = "Parking garage is full.";
    private static final String EMPTY = "Parking garage is empty.";
    private static final String ONESTEP = "May only have one car enter or leave.";
    
    private int maximumCars;
    private int totalCars;
    private double totalHoursCharged;
    private double totalDollarsCollected;
    private Company company;
    
    private CarDatabase data = new CarDatabase();

    public ParkingGarage(int maximumCars, Company company) {
        setMaximumCars(maximumCars);
        setCompany(company);
    }

    public final CarDatabase getCarDatabase(){
        return data;
    }
    
    public final int getMaximumCars() {
        return maximumCars;
    }

    public final void setMaximumCars(int maximumCars) {
        this.maximumCars = maximumCars;
    }

    public final int getTotalCars() {
        return totalCars;
    }
    public final void setTotalCars(int totalCars) {
        if (totalCars == (++this.totalCars)||totalCars == (--this.totalCars)) {
            this.totalCars = totalCars;
        }else{
            throw new IllegalArgumentException(ONESTEP);
        }
    }
    public final void addCar(Car c) {
        if(totalCars < maximumCars){
            data.addCar(c);
            totalCars++;
        }else {
            throw new IllegalArgumentException(FULL);
        }
    }
    
    public final Car findCar(int carID){
        return data.findCar(carID);
    }
    
    public final void removeCar(Car c) {
        if(totalCars != 0){
            data.removeCar(c);
            totalCars--;
        }else {
            throw new IllegalArgumentException(EMPTY);
        }
    }

    public final Company getCompany() {
        return company;
    }

    public final void setCompany(Company company) {
        this.company = company;
    }

    public final double getTotalHoursCharged() {
        return totalHoursCharged;
    }

    public final void setTotalHoursCharged(double totalHoursCharged) {
        this.totalHoursCharged = totalHoursCharged;
    }

    public final double getTotalDollarsCollected() {
        return totalDollarsCollected;
    }

    public final void setTotalDollarsCollected(double totalDollarsCollected) {
        this.totalDollarsCollected = totalDollarsCollected;
    }
       
}
/*
 * Would use these methods to get a ID that is unique to the
 * instance of a parking garage. Would use an id system inside
 * the functions of the database.
 */
//  private int currentCarID;
//
//    public final int getNextCarID() {
//        if( currentCarID == 0 ){
//            return 0;
//        }
//        
//        addToCurrentCarID();
//        return currentCarID;
//    }
//
//    private final void addToCurrentCarID() {
//        ++this.currentCarID;
//    }
