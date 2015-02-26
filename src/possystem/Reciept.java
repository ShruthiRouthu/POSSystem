
package possystem;

import java.util.Date;

public class Reciept {
    
    private Customer customer;
    private Date dateTime;
    private LineItem[] lineItems = new LineItem[0];
    private DataAccessStrategy db;
    private Template template;
    
    public Reciept(String customerID) {
        setCustomer(customerID);
    }
     
    public Customer findCustomerByID(String customerID)
    {
        return db.findCustomerByID(customerID);
    }
    
    public void setCustomer(String customerID) {
        this.customer = findCustomerByID(customerID);
    }
        
    public void addLineItem(String productID, double quantity){
        // increses array size by 1 and cretes lineIrem object and adds it to array 
    }
    
    public void findLineItem(String productID, double quantity){
        //should return the index of found lineitem
           
    }
    
    public void editLineItem(String productID, double quantity){
        //should edit the lineitem
    }
    
    public void deleteLineItem(String productID, double quantity){
        //should delete lineitenm from array
    }
    
    
    
}
