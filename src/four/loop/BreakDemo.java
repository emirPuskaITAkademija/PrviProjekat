package four.loop;

import javax.swing.*;

public class BreakDemo {
    public static void main(String[] args) {
        int[] nizBrojeva = {23, 14, 123, 56, 76, 45677, 34};
        String uneseniBrojText = JOptionPane.showInputDialog("Unesi neki cijeli broj");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);
        boolean foundIt = false;
        for(int i = nizBrojeva.length-1; i>=0; i--){
            int number = nizBrojeva[i];
            if(uneseniBroj == number){
                foundIt = true;
                break;
            }
        }
        if(foundIt){
            JOptionPane.showMessageDialog(null, "BINGO!!!!!!!!!!");
        }else{
            JOptionPane.showMessageDialog(null, "IZVINJAVAMO SE ŠTO STE NESRETNI...");
        }
    }
}
