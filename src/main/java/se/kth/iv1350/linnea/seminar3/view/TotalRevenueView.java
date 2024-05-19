package se.kth.iv1350.linnea.seminar3.view;

import se.kth.iv1350.linnea.seminar3.model.Amount;

/**
 * Shows total income from all sales.
 */
public class TotalRevenueView extends TotalRevenue {
    
    /**
     * Prints out total revenue
     * 
     * @param totalRevenue the total revenue of all sales.
     * @throws Exception if the method cannot be completed.
     */
    @Override
    protected void doShowTotalIncome(Amount totalRevenue) throws Exception{
        System.out.println("Current total revenue is: " + totalRevenue.toString());
    }

    @Override
    protected void handleErrors(Exception e){
        System.out.println("Cannot print to console.");
    }
        

}
