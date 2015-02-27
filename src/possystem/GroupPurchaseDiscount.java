
package possystem;

public class GroupPurchaseDiscount implements ProductDiscountStrategy {
    
    private static final double MIN_DISC_RATE = 0.0;
    private static final double  MAX_DISCOUNT_RATE = 1.0;
    private static final String DISC_RATE_ENTRY_ERROR = "Discount rate must be equal to or be  between " 
                                                        + MIN_DISC_RATE+ " and " + MAX_DISCOUNT_RATE ;
    private int groupQuantity;
    private double discRatePerGroup;
    
// Constructor
    public GroupPurchaseDiscount(final int groupQuantity, final double discRatePerGroup) {
        this.groupQuantity = groupQuantity;
        this.discRatePerGroup = discRatePerGroup;
    }

// Implementing Abstract methods
    @Override
    public final double getDiscountedTotal(final double unitPrice,final  int qty) {
        
       int nofGroups = qty/groupQuantity;
       int remainingProducts = qty%groupQuantity;
       
       double grpPrice = ( unitPrice * groupQuantity* (1.0 - discRatePerGroup ));
       
       return (nofGroups*grpPrice) + (remainingProducts*unitPrice) ;
              
    }
    
    @Override
    public final double getSavings(final double unitPrice, final int qty) {
        return unitPrice*qty - getDiscountedTotal(unitPrice,qty);
    }
    
    
// Getters & Setters

    public final int getGroupQuantity() {
        return groupQuantity;
    }

    public final void setGroupQuantity(final int groupQuantity) {
        if(groupQuantity <= 0)
        {
            throw new IllegalArgumentException("groupQuantity should be greater than 0") ;
        }
        this.groupQuantity = groupQuantity;
    }

    public final double getDiscRatePerGroup() {
        return discRatePerGroup;
    }

    public final void setDiscRatePerGroup(final double discRatePerGroup) {
      if(discRatePerGroup < MIN_DISC_RATE || discRatePerGroup > MAX_DISCOUNT_RATE )
        {
            throw new IllegalArgumentException(DISC_RATE_ENTRY_ERROR);
        }
        this.discRatePerGroup = discRatePerGroup;
    }
    
  
    
    
}
