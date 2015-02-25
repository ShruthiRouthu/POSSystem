
package possystem;

public class FlatRateDiscount implements ProductDiscountStrategy{

    private double discountAmount ;

// Constructor
    public FlatRateDiscount(double discountAmount) {
        setDiscountAmount(discountAmount);
    }
    
    
// Implemetation of Abstract Methods 
    @Override
    public final double getPriceAfterDiscount(double unitPrice, int qty) {
        return (unitPrice - discountAmount)*qty;
    }

    @Override
    public final double getSavings(double unitPrice, int qty) {
        return getOriginalPrice(unitPrice,qty) - getPriceAfterDiscount(unitPrice,qty);
    }

    @Override
    public final double getOriginalPrice(double unitPrice, int qty) {
        return unitPrice*qty;
    }

// Getters and Setters
    
    public final double getDiscountAmount() {
        return discountAmount;
    }

    public final void setDiscountAmount(double discountAmount) {
        if(discountAmount < 0) 
        {
            throw new IllegalArgumentException("discountAmount cannot be negative");
        }
        this.discountAmount = discountAmount;
    }
    
    
    
}
