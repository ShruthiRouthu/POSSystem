
package possystem;

public interface ProductDiscountStrategy {
    
    public abstract double getDiscountedTotal(double unitPrice, int qty );
    
    public abstract double getSavings(double unitPrice, int qty );

}  
