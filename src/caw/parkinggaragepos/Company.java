package caw.parkinggaragepos;

/**
 * caw.parkinggaragepos\Company.java
 * Oct 17, 2012 1:44:04 PM
 * Advanced Java Programming 152-135-10442-13
 * @author Charles Wojciuk
 */

//import java.util.Calendar;

public class Company {
    
    private final String NAMEEXCEPTION = "Company Name cannot be null";
    private final String PARKINGEXCEPTION = "Company fee strategy cannot be null";
    
    private String companyName;
    private FeeParkedCarCalculatorStrategy parkingFeeStrategy;
    /**
     * Company constructor that enforces a company name and a 
     * FeeParkedCarCalculatorStrategy. Calls setCompanyName and
     * setParkingFeeStrategy to validate the incoming values.
     * @param companyName
     * @param parkingFeeStrategy 
     */
    public Company(String companyName, FeeParkedCarCalculatorStrategy parkingFeeStrategy) {
        
        setCompanyName(companyName);
        setParkingFeeStrategy(parkingFeeStrategy);
    }

    public final String getCompanyName() {
        return companyName;
    }

    public final void setCompanyName(String companyName) {
        if(companyName != null){
            this.companyName = companyName;
        }else{
            throw new IllegalArgumentException(NAMEEXCEPTION);
        }
    }

    public final FeeParkedCarCalculatorStrategy getParkingFeeStrategy() {
        return parkingFeeStrategy;
    }

    public final void setParkingFeeStrategy(FeeParkedCarCalculatorStrategy parkingFeeStrategy) {
        if(parkingFeeStrategy != null){
            this.parkingFeeStrategy = parkingFeeStrategy;
        }else{
            throw new IllegalArgumentException(PARKINGEXCEPTION);
        }
    }
    
    
    
    
}
