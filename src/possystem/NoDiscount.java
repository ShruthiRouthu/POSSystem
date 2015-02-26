
package possystem;

public class NoDiscount implements ProductDiscountStrategy {  

// Constructor
    public NoDiscount() { 
    } 
    
// Implementation of Abstract Methods   

    @Override
    public final double getDiscountedTotal(double unitPrice, int qty) {
       return unitPrice*qty;
    }

    @Override
    public final double getSavings(double unitPrice, int qty) {
        return 0;
    }
    
}   
