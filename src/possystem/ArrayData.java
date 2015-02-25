
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
        new Product("P222", "Women's Jeans", 50.00 , new PercentageDiscount(0.20) ),
        new Product("P333", "Women's Dress", 100.00, new NoDiscount()),
        new Product("P222", "Men's Pair of Socks", 5.00, new MinimumQuantityDiscount(10,0.50)),
        new Product("P222", "Men's Coat", 150.00,new FlatRateDiscount(50.00))
        
    };

    @Override
    public Customer findCustomerByID(String customerID) {
        if(customerID == null && customerID.length() == 0)
        {
            System.out.println("Sorry, findCustomerByID method has illegal argument");
            return null;  
        }
        
        // Initializing customer object
        Customer myCustomer = null;
        
        for(Customer c:customerArray)
        {
            if(c.getCustomerID().equals(customerID))
            {
                myCustomer = c;
            }
        }
        
        return myCustomer;
    }

    @Override
    public Product findProductByID(String productID) {
         if(productID == null && productID.length() == 0)
        {
            System.out.println("Sorry, findProductByID method has illegal argument");
            return null;  
        }
        
        // Initializing customer object
        Product myProduct = null;
        
        for(Product p: productArray)
        {
            if(p.getProductID().equals(productID))
            {
                myProduct = p;
            }
        }
        
        return myProduct;
        
    }
    
    
    
}
