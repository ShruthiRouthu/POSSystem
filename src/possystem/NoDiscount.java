
package possystem;

public class NoDiscount implements ProductDiscountStrategy {  

// No Arg Constructor
    
    public NoDiscount() { 
    } 
    
// Implementation of Abstract Methods   

    @Override
    public final double getPriceAfterDiscount(double unitPrice, int qty) {
       return unitPrice*qty;
    }

    @Override
    public final double getSavings(double unitPrice, int qty) {
        return 0;
    }

    @Override
    public final double getOriginalPrice(double unitPrice, int qty) {
        return unitPrice*qty;
    }
    


    
    
    
}
