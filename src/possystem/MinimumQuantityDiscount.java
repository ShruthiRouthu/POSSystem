
package possystem;

public class MinimumQuantityDiscount implements ProductDiscountStrategy {
    
    private static final double MIN_DISC_RATE = 0.0;
    private static final double  MAX_DISCOUNT_RATE = 1.0;
    private static final String DISC_RATE_ENTRY_ERROR = "Discount rate must be equal to or be  between " 
                                                        + MIN_DISC_RATE+ " and " + MAX_DISCOUNT_RATE ;
    
    private int minimumQty;
    private double discRatePerUnit;
    
// Constructor
    public MinimumQuantityDiscount(int minimumQty, double discRatePerUnit) {
        setMinimumQty(minimumQty);
        setDiscRatePerUnit(discRatePerUnit);
    }
    
// Implementing Abstract Methods 
    
    @Override
    public final double getDiscountedTotal(double unitPrice, int qty) {
        if(qty >= minimumQty)
        {
            return unitPrice*(1.0 - discRatePerUnit)*qty ;
        }
        else
        {
            return unitPrice*qty;
        }
    }            
    
    @Override
    public double getSavings(double unitPrice, int qty) {
        return (unitPrice*qty - getDiscountedTotal(unitPrice, qty));
    }
      
// Getters and Setters

    public final int getMinimumQty() {
        return minimumQty;
    }

    public final void setMinimumQty(int minimumQty) {
        if(minimumQty < 0)
        {
            throw new IllegalArgumentException("minimumQty cannot be negative");
        }
        this.minimumQty = minimumQty;
    }

    public final double getDiscRatePerUnit() {
        return discRatePerUnit;
    }
    
    public final void setDiscRatePerUnit(double discRatePerUnit) {
        if(discRatePerUnit < MIN_DISC_RATE || discRatePerUnit > MAX_DISCOUNT_RATE )
        {
            throw new IllegalArgumentException(DISC_RATE_ENTRY_ERROR);
        }
        this.discRatePerUnit = discRatePerUnit;
    }

   


  
    
    
    
}
