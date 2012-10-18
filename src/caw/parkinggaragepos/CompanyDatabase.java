package caw.parkinggaragepos;

/**
 * caw.parkinggaragepos\CompanyDatabase.java
 * Oct 18, 2012 10:38:45 AM
 * Advanced Java Programming 152-135-10442-13
 * @author Charles Wojciuk
 */

/*
 *Represents a database.
 */
public class CompanyDatabase {
    private Company[] companies = {
        new Company("Best Value", new FeeBestValueCalculator()),
        new Company("Thrifty", new FeeThrifyCalculator())
    };
    public final Company findCompany(final String companyName) {
        // validation is needed
        Company company = null;
        for(Company c : companies) {
            if(companyName.equals(c.getCompanyName())) {
                company = c;
                break;
            }
        }
        
        return company;
    }
    
}
