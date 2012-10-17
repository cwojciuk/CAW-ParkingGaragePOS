/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caw.parkinggaragepos;

/**
 *
 * @author cwojciuk
 */
public class Company {
    
    private final String IDEXCEPTION = "Company ID cannot be null";
    private final String NAMEEXCEPTION = "Company Name cannot be null";
    private final String PARKINGEXCEPTION = "Company fee strategy cannot be null";
    
    private String companyName;
    private FeeParkedCarCalculatorStrategy parkingFeeStrategy;

    public Company(String companyName, FeeParkedCarCalculatorStrategy parkingFeeStrategy) {
        
        setCompanyName(companyName);
        setParkingFeeStrategy(parkingFeeStrategy);
    }

    public final String getCompanyName() {
        return companyName;
    }

    public final void setCompanyName(String companyName) {
        if(parkingFeeStrategy != null){
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
