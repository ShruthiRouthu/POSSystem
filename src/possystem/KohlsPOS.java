
package possystem;

import java.util.Random;

public class KohlsPOS {

    
    public static void main(String[] args) {

        
        
        CashRegister cr = new CashRegister();
        
        cr.startSale("C101",new ArrayData());
        cr.addItem("P111", 3);
        cr.addItem("P222", 1);
        cr.addItem("P333", 1);
        cr.addItem("P444", 15);
        cr.addItem("P555", 1);
        cr.endSale(new ConsoleOutput());
        
        cr.startSale("C303", new ArrayData());
        cr.addItem("P222", 4);
        cr.addItem("P333", 1);
        cr.addItem("P444", 25);
        cr.addItem("P555", 2);
        cr.endSale(new ConsoleOutput());
        
        cr.startSale("C505",new ArrayData());
        cr.addItem("P111", 3);
        cr.cancelSale();
        
      
        
    }
    
}
