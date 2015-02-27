
package possystem;

import javax.swing.JOptionPane;

public class GUIOutput implements RecieptOutputStrategy{

    @Override
    public final void outputReciept(String recieptString) {
        
        if(recieptString == null || recieptString.length() == 0){
            throw new IllegalArgumentException("String parameter to outputReciept() method is inavalid ");
        }
        
        JOptionPane.showMessageDialog(null, recieptString);
    }
    
}
