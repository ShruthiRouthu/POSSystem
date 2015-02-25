
package possystem;

public class Product {
    
// Properties 
    
    private String productID;
    private String productDescription;
    private double unitPrice;
    private ProductDiscountStrategy productDiscount;
    
    
// Constructor
    
    public Product(String productID, String productDescription, double unitPrice, ProductDiscountStrategy productDiscount) {
        setProductID(productID);
        setProductDescription(productDescription);
        setUnitPrice(unitPrice);
        setProductDiscount(productDiscount);
    }
  
// Query Methods which delegate work to DiscountStrategy objects
    
    public final double getDiscountedPrice(int productQty)
    {
       return  productDiscount.getPriceAfterDiscount(unitPrice, productQty);
    }
    
    public final double getSavings(int productQty)
    {
        return  productDiscount.getSavings(unitPrice, productQty);
    }
     
    public final double getOriginalPrice(int productQty)
    {
        return  productDiscount.getOriginalPrice(unitPrice, productQty); 
    }
    
    
         
// Getters and Setters
      
    public final String getProductID() {
        return productID;
    }

    public final void setProductID(String productID) {
            
        if(productID == null)
        {
            throw new NullPointerException();
        }
        else if(productID.length() == 0) 
        {
            throw new IllegalArgumentException("Error: Invalid productID !" +
                                               " Preferred format P + 3 digits (C000) ");
        }
        
        this.productID = productID;
    }

    public final String getProductDescription() {
        return productDescription;
    }

    public final void setProductDescription(String productDescription) {
        
        if(productDescription == null)
        {
            throw new NullPointerException();
        }
        else if(productDescription.length() <= 0) 
        {
            throw new IllegalArgumentException("Error: Length of productDescription should be greater than 0");
        }
        
        this.productDescription = productDescription;
    }

    public final double getUnitPrice() {
        return unitPrice;
    }

    public final void setUnitPrice(double unitPrice) {
        
        if(unitPrice < 0 )
        {
            throw new IllegalArgumentException("Unit Price cannot be negative !");
        }
        this.unitPrice = unitPrice;
    }

    public final ProductDiscountStrategy getProductDiscount() {
        return productDiscount;
    }

    public final void setProductDiscount(ProductDiscountStrategy productDiscount) {
        this.productDiscount = productDiscount;
    }
    
    
    
}
