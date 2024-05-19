package se.kth.iv1350.linnea.seminar3.view;

import se.kth.iv1350.linnea.seminar3.model.Amount;
import se.kth.iv1350.linnea.seminar3.util.TotalRevenueLogger;

/**
 * Shows total income from all sales.
 */
public class TotalRevenueFileOutput extends TotalRevenue {
    
    /**
     * Prints total revenue to a file.
     * 
     * @param totalRevenue the total revenue of all sales.
     * @throws Exception if the logger cannot be initialised.
     */
    @Override
    protected void doShowTotalIncome(Amount totalRevenue) throws Exception{
        TotalRevenueLogger logger = new TotalRevenueLogger();
        logger.log("Current total revenue is: " + totalRevenue.toString());
    }

    /**
     * Prints error message if method throws exception.
     * 
     * @param e the exception that was thrown.
     */
    @Override
    protected void handleErrors(Exception e){
        System.out.println("Cannot print to file.");
    }

}