
package possystem;

public interface DataAccessStrategy {
    
// Abstract methods
    
    public abstract Customer findCustomerByID(String customerID);
    
    public abstract Product findProductByID(String productID);
    
    
    
}
