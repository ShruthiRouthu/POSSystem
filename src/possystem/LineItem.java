package possystem;

public class LineItem {

    private Product product;
    private int quantity;


//  Constructor
    public LineItem(String productID, int quantity, DataAccessStrategy db) {
        product = findProductByID(productID, db);
        setQuantity(quantity);
    }

//  Getters and Setters  
    public final Product getProduct() {
        return product;
    }

    public final int getQuantity() {
        return quantity;
    }

    public final void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative ");
        }
        this.quantity = quantity;
    }

    public final String getProductID() {
        return this.product.getProductID();
    }

//  Helper method 
    private final Product findProductByID(String productID, DataAccessStrategy db) {
        return db.findProductByID(productID);
    }
}
