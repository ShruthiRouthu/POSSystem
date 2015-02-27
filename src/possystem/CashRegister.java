
package possystem;

public class CashRegister {

    private Reciept reciept;
      
    public CashRegister() {
    }
   
    public final void startSale(String customerID, DataAccessStrategy db) {
        reciept = new Reciept(customerID, db);
    }

    public final void  addItem(String productID, int quantity) {
        reciept.addLineItem(productID, quantity);
    }

//    public final void deleteItem(String productID, int quantity) {
//        reciept.deleteLineItem(productID, quantity);
//    }
    
    public final void endSale(RecieptOutputStrategy output) {
        output.outputReciept(reciept.getRecieptString());
        reciept = null;
    }

    public final void cancelSale() {
        reciept = null; 
        System.out.println("\n\n\t Sale Cancelled. ");
    }

   
    
}
