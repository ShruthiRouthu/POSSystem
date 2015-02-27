
package possystem;

public class FlatRateDiscount implements ProductDiscountStrategy{

    private double discountAmount = 10.00;

// Constructor
    public FlatRateDiscount(double discountAmount) {
        setDiscountAmount(discountAmount);
    }

    public FlatRateDiscount() {
    }
    
    
// Implemetation of Abstract Methods 
    @Override
    public final double getDiscountedTotal(double unitPrice, int qty) {
        return (unitPrice - discountAmount)*qty;
    }

    @Override
    public final double getSavings(double unitPrice, int qty) {
        return unitPrice*qty - getDiscountedTotal(unitPrice,qty);
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
