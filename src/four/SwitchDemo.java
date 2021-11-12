package four;

import javax.swing.*;
import java.awt.*;

/**
 *
 * <p>
 *     switch-case-break
 * </p>
 * prost tip podatka,,
 * <li> 1. int  ->   Integer
 * <li>2. short -> Short
 * <li>3. double -> Double
 * Kontrola toka.
 */
public class SwitchDemo {
    public static void main(String[] args) {
        String brojDanaText = JOptionPane.showInputDialog("Unesi broj dana u sedmici");
        int brojDana = Integer.parseInt(brojDanaText);
        String imeDana = null;
        switch (brojDana) {
            case 1:
                imeDana = "Montag";
                break;
            case 2:
                imeDana = "Dienstag";
                break;
            case 3:
                imeDana = "Mittwoch";
                break;
            case 4:
                imeDana = "Donnerstag";
                break;
            case 5:
                imeDana = "Freitag";
                break;
            case 6:
                imeDana = "Samstag";
                break;
            case 7:
                imeDana = "Sonntag";
                break;
            default:
                JOptionPane.showMessageDialog(null,"Sedmica ima 7 dana i upravo zbog toga i jeste sedmica");
        }

        if(imeDana != null){
            JOptionPane.showMessageDialog(null, "Tag: " + imeDana);
        }
    }
}
