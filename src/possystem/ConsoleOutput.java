
package possystem;

public class ConsoleOutput implements RecieptOutputStrategy {
    
    @Override
    public final void outputReciept(String recieptString) {
        
        if(recieptString == null || recieptString.length() == 0){
            throw new IllegalArgumentException("String parameter to outputReciept() method is inavalid ");
        }
        
        System.out.println("\n\n" + recieptString);
    }
    
    
}
