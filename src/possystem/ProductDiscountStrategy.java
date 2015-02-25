
package possystem;

public interface ProductDiscountStrategy {
  
    // write detailed comments about what each method does
    
// abstract methods  
    
    public abstract double getPriceAfterDiscount(double unitPrice, int qty );
    
    public abstract double getSavings(double unitPrice, int qty );
    
    public abstract double getOriginalPrice(double unitPrice, int qty ); 
    
}
