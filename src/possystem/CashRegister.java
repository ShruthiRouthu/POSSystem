
package possystem;

public class CashRegister {

    private Reciept r;
    private Printer printer;
    
    public CashRegister() {
    }
    
    public void startSale(String customerID)
    {
        Reciept r = new Reciept(customerID);
    }
    
    public void addLineItem(String productID, double quantity)
    {
        r.addLineItem(productID, quantity);
    }
    
    public void editLineItem(String productID, double quantity){
        r.editLineItem(productID, quantity);
    }
    
    public void deleteLineItem(String productID, double quantity){
        r.deleteLineItem(productID, quantity);
    }
    
    public void endSale()
    {
        //Print using printer object
    }
    
    public void CancelSale()
    {
        //Print using printer object
    }

}
