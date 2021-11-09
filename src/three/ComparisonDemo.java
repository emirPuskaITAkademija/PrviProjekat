package three;


import java.util.Scanner;

/**
 * TIP VARIJABLA = vrijednost;
 * <p>
 * OPERATORE POREĐENJA
 * </p>
 */
public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi cijeli broj: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi cijeli broj:");
        int number2 = new Scanner(System.in).nextInt();
        //jednakosti
        if (number1 == number2) {
            System.out.println("hej unio si dva jednaka broja");
        }
        if (number1 != number2) {
            System.out.println("hej unijeli ste dva nejednaka broja");
        }
        if (number1 > number2) {
            System.out.println("Prvi broj je veći od drugog broja");
        }
        if (number1 >= number2) {
            System.out.println("Prvi broj je veći ili jednak od drugog broja");
        }
        if(number1< number2){
            System.out.println("Prvi broj je manji od drugog");
        }
        if(number1<=number2){
            System.out.println("Prvi broj je manji ili jednak drugom");
        }
    }
}
