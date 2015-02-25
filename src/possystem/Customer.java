
package possystem;

public class Customer {
   
    private String customerID;
    private String customerName;

// Constructor
    
    public Customer() {
    }

    public Customer(String customerID, String customerName) {
        setCustomerID(customerID);
        setCustomerName(customerName);
    }
    
// Getters & Setters
  
    public  final String getCustomerID() {
        return customerID;
    }

    public final void setCustomerID(String customerID) {
             
        if(customerID == null)
        {
            throw new NullPointerException();
        }
        else if(customerID.length() == 0) 
        {
            throw new IllegalArgumentException("Error: Invalid customerID !" +
                                               " Preferred format C + 3 digits (C000) ");
        }
        
        this.customerID = customerID;
    }

    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String customerName) {
        
        if(customerName == null)
        {
            throw new NullPointerException();
        }
        else if(customerName.length() <= 0) 
        {
            throw new IllegalArgumentException("Error:Length of Customer Name should be greater than 0 " );
                                               
        }
        this.customerName = customerName;
    }
    
    
}
