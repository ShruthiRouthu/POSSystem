
package possystem;

public class PercentOffDiscount implements ProductDiscountStrategy {
       
    private static final double MIN_DISC_RATE = 0.0;
    private static final double  MAX_DISCOUNT_RATE = 1.0;
    private static final String DISC_RATE_ENTRY_ERROR = "Discount rate must be equal to or be  between " 
                                                        + MIN_DISC_RATE+ " and " + MAX_DISCOUNT_RATE ;
    
    private double discountRate;
 

// Constructor    
    public PercentOffDiscount(final double discountRate) {
        setDiscountRate(discountRate);
    }

// Implementing abstract methods
    
    @Override
    public final double getDiscountedTotal(final double unitPrice, final int qty) {
        return unitPrice*qty*(1-discountRate);
    }
    
    @Override
    public final double getSavings(final double unitPrice, final int qty) {
       return unitPrice*qty - getDiscountedTotal(unitPrice,qty);
    }
    
    
     
// Getters and Setters
    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(final double discountRate) {
        if(discountRate < MIN_DISC_RATE || discountRate > MAX_DISCOUNT_RATE )
        {
            throw new IllegalArgumentException(DISC_RATE_ENTRY_ERROR);
        }
        this.discountRate = discountRate;
    }

   

   
    
    
}
