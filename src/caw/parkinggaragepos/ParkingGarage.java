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

    private Company company;
    
    private CarDatabase data = new CarDatabase();
    private CompanyDatabase cdata = new CompanyDatabase();

    public ParkingGarage(int maximumCars, Company company) {
        setMaximumCars(maximumCars);
        setCompany(company);
    }
    
    /**
     * Adds the amount of a receipt to the totalEarned value of the
     * fake database. Would normally be in another table with a relationship
     * to the parkedCar table based on carID.
     * @param receiptAmount 
     */
    public final void addToTotalEarned(double receiptAmount) {
        //validation is handled in the Car database class
        data.addToTotalEarned(receiptAmount);
    }
    
    /**
     * Adds the hours of a receipt to the totalHours value of the
     * fake database. Would normally be in another table with a relationship
     * to the parkedCar table based on carID.
     * @param receiptHours 
     */
    public final void addToTotalHours(double receiptHours) {
        //validation is handled in the Car database class
        data.addToTotalHours(receiptHours);
    }
    
    /**
     * Adds one to the total cars value represents the
     * total number of cars that have ever used the
     * parking garage.
     */
    public final void addOneToTotalCarsParked() {
        data.addOneToTotalCarsParked();
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
    
    /**
     * Returns the totalHours of a database object.
     * @return 
     */
    public final double getTotalHours() {
        return data.getTotalHours();
    }
    
    /**
     * Returns the totalEarned of a database object.
     * @return 
     */
    public final double getTotalEarned() {
        return data.getTotalEarned();
    }
    
    public final Company findCompany(final String companyName) {
        // validation is needed
        return cdata.findCompany(companyName);
    }
    
    public final FeeParkedCarCalculatorStrategy getFeeStrategy(){
        return cdata.findCompany(getCompany().getCompanyName()).getParkingFeeStrategy();
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
