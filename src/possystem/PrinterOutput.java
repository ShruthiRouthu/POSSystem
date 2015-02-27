package possystem;

public class PrinterOutput implements RecieptOutputStrategy {
    
    @Override
    public final void outputReciept(String recieptString){
        
        if(recieptString == null || recieptString.length() == 0){
            throw new IllegalArgumentException("String parameter to outputReciept() method is inavalid ");
        }
        
        // Faking It !!!
        System.out.println("Printer has printed a reciept!");
    }
    
    
}
