
package possystem;

public class ArrayData implements DataAccessStrategy{
    
    private Customer[] customerArray = { 
          
        new Customer("C101", "James"),
        new Customer("C202", "Emily Brown"),
        new Customer("C303", "Logan Williams"),
        new Customer("C404", "Sophia Taylor"),
        new Customer("C505", "Nora Jones") 
    
    };  
    
    
    private Product[] productArray = {
       
        new Product("P111", "Men's T-Shirt", 20.00,new GroupPurchaseDiscount(2,0.25) ),
        new Product("P222", "Women's Jeans", 50.00 , new PercentOffDiscount(0.20) ),
        new Product("P333", "Women's Dress", 100.00, new NoDiscount()),
        new Product("P222", "Men's Pair of Socks", 5.00, new MinimumQuantityDiscount(10,0.50)),
        new Product("P222", "Men's Coat", 150.00,new FlatRateDiscount(50.00))
        
    };

    @Override
    public Customer findCustomerByID(String customerID) {
        
        if(customerID == null)
        {
            throw new NullPointerException();
        }
        else if(customerID.length() == 0) 
        {
            throw new IllegalArgumentException("Error: Invalid productID !" +
                                               " Required format C + 3 digits (C000) ");
        }
         
        // Initializing customer object
        Customer myCustomer = null;
        
        for(Customer c:customerArray)
        {
            if(c.getCustomerID().equals(customerID))
            {
                myCustomer = c;
                break;
            }
        }
        
        return myCustomer;
    }

    @Override
    public Product findProductByID(String productID) {
        
        if(productID == null)
        {
            throw new NullPointerException();
        }
        else if(productID.length() == 0) 
        {
            throw new IllegalArgumentException("Error: Invalid productID !" +
                                               " Preferred format P + 3 digits (P000) ");
        }
        
        // Initializing customer object
        Product myProduct = null;
        
        for(Product p: productArray)
        {
            if(p.getProductID().equals(productID))
            {
                myProduct = p;
                break;
            }
        }
        
        return myProduct;
        
    }
    
    
    
}
