
package possystem;

public interface DataAccessStrategy {
     
    public abstract Customer findCustomerByID(String customerID);
    
    public abstract Product findProductByID(String productID);
    
}  
