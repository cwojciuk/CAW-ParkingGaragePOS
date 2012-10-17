package caw.parkinggaragepos;

public class ParkingGarage {
    private static final String FULL = "Parking garage is full.";
    private static final String EMPTY = "Parking garage is empty.";
    private static final String ONESTEP = "May only have one car enter or leave.";
    
    private int maximumCars;
    private int totalCars;
    private double totalHoursCharged;
    private double totalDollarsCollected;
    private Company company;
    private int currentCarID;
    CarDatabase data = new CarDatabase();

    public ParkingGarage(int maximumCars, Company company) {
        setMaximumCars(maximumCars);
        setCompany(company);
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

    public final int getNextCarID() {
        if( currentCarID == 0 ){
            return 0;
        }
        
        addToCurrentCarID();
        return currentCarID;
    }

    private final void addToCurrentCarID() {
        ++this.currentCarID;
    }

    public final CarDatabase getData() {
        return data;
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
