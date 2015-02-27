
package possystem;

//import java.util.Date;
import java.util.Random;

public class Reciept {
    
    private Customer customer;
   // private Date dateTime; //Format and use it later
    private LineItem[] lineItems = new LineItem[0];
    private DataAccessStrategy db;
    
// Constructor    
    public Reciept(String customerID, DataAccessStrategy db) {
        setDB(db);
        setCustomer(customerID);
    }
 
//  Other Methods    
    private final Customer findCustomerByID(String customerID) {
        return this.db.findCustomerByID(customerID);
    }
          
    public final void addLineItem(String productID, int quantity){
        
        LineItem[] temp = new LineItem[lineItems.length + 1] ; //Creating temporary array
        
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length );// Copying lineItems array to temp array 
        
        lineItems = temp; // Swapping arrays
        temp = null;
        
        lineItems[lineItems.length-1] = new LineItem(productID,quantity,db); // Adds new LineItem to array
        
    }
    
    // Helper method
    private final int findLineItem(String productID, int quantity) {
        
        int index = -1; // Flag
        
        // looping through lineItem Array
        for (int i = 0; i < lineItems.length; i++) {
            if (lineItems[i].getProductID().equals(productID) && lineItems[i].getQuantity() == quantity) {
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    
//    public final void deleteLineItem(String productID, int quantity){
//        
////        int index = findLineItem(productID, quantity);
////        if(index == -1)
////        {
////            throw new IllegalArgumentException("LineItem doesn't exist");
////        }
////        
////        LineItem[] temp = new LineItem[lineItems.length + 1] ; //Creating temporary array
////        
////        System.arraycopy(lineItems, 0, temp, 0, lineItems.length );// Copying lineItems array to temp array 
////        
////        lineItems = temp; // Swapping arrays
////        temp = null;
////        
////        lineItems[lineItems.length-1] = new LineItem(productID,quantity);
//        
//        
//    }
    
    public final String getRecieptString(){ // Can I add a Strategy layer here ???? y.es you can ! Do it if u have time
        
        Random randomNumber = new Random(System.nanoTime());
        double billTotal = 0;
        double totalSavings = 0;
        
        String recieptStr = "";
        recieptStr += "\n" + customer.getCustomerName();
        recieptStr += "\n" + randomNumber.nextInt(999999)+ 100000;    // make this random better
        recieptStr += "\n---------------------------------------------------------------------";
        
        for(LineItem item : lineItems)
        {
            billTotal  += item.getProduct().getDiscountedTotal(item.getQuantity());
            totalSavings += item.getProduct().getSavings(item.getQuantity());
            
            recieptStr += "\n" + item.getProduct().getProductID() 
                          + "      " + item.getProduct().getProductDescription()
                          + "      " + item.getProduct().getUnitPrice()
                          + "      " + item.getQuantity()
                          + "      " + item.getProduct().getDiscountedTotal(item.getQuantity())
                          + "\nYou Saved $" + item.getProduct().getSavings(item.getQuantity()) ;
                           
        }
        
        recieptStr += "\n---------------------------------------------------------------------";
        recieptStr += "\nTotal : $" + billTotal;
        recieptStr += "\nTotal Savings: $" + totalSavings;
        recieptStr += "\n\n\n\tThank You for shopping at Kohl's";
           
        return recieptStr;
    }
    
// Setters and Getters    
    
    // remove necessary getters and setters Consider encapsulation
    public final void setCustomer(String customerID) {
        this.customer = findCustomerByID(customerID);
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final DataAccessStrategy getDB() {
        return db;
    }

    public final void setDB(DataAccessStrategy db) {
        this.db = db;
    }

   
        
}
