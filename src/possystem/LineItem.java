package possystem;

public class LineItem {
    
    private Product product;
    private double quantity;
    private DataAccessStrategy db;

    public LineItem(String productID, double quantity) {
        setProduct(productID);
        setQuantity(quantity);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(String productID) {
        this.product = findProductByID(productID);
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        if(quantity < 0)
        {
            throw new IllegalArgumentException("Quantity cannot be negative ");
        }
        this.quantity = quantity;
    }
    
    public Product findProductByID(String productID)
    {
        return db.findProductByID(productID);
    }
    
    //have to figure out this
    @Override
    public String toString()
    {
        return "";
    }
}
