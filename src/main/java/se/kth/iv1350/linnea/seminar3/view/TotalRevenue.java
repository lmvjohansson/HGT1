package se.kth.iv1350.linnea.seminar3.view;

import se.kth.iv1350.linnea.seminar3.model.Amount;
import se.kth.iv1350.linnea.seminar3.model.SaleDTO;
import se.kth.iv1350.linnea.seminar3.model.SaleObserver;

/**
 * Shows the total revenue since the program started.
 */
public abstract class TotalRevenue implements SaleObserver {
    private Amount totalRevenue;
    
    /**
     * Creates a new instance and sets totalRevenue to zero.
     */
    protected TotalRevenue (){
        totalRevenue = new Amount();
    }
    
     /**
     * Invoked when a sale has been completed.
     * 
     * @param sale the sale that was completed.
     */
    @Override
    public void newSale(SaleDTO sale){
        calculateTotalIncome(sale);
        showTotalIncome();
    }
    
    private void calculateTotalIncome(SaleDTO sale){
        totalRevenue = totalRevenue.plus(sale.getRunningTotal());
    }

    private void showTotalIncome() {
        try {
            doShowTotalIncome(totalRevenue);
        } catch (Exception e) {
            handleErrors(e);
        }
    }

    /**
     * Shows total revenue.
     * @param totalRevenue the total revenue of all sales.
     * 
     * @throws Exception if the method could not be carried out.
     */
    protected abstract void doShowTotalIncome(Amount totalRevenue) throws Exception;

    /**
     * Handles errors if exception is thrown.
     * 
     * @param e the exception that was thrown.
     */
    protected abstract void handleErrors(Exception e);
    
}
