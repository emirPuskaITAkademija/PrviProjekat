package two;

/**
 * Operatori;
 * <li> 1. Dodjele</li>
 * <li> 2. Aritmetički</li>
 * <li> 3. Unarni operatori</li>
 * <p>
 * + -> Additive
 * - -> Subtraction
 * * -> Multiplication
 * / -> Division
 * % -> Modulo
 */
public class ArithmeticDemo {
    public static void main(String[] args) {
        int broj1 = 23;
        int broj2 = 13;
        //Addition Zbrajanje
        int result = broj1 + broj2;//36
        System.out.println("Suma: " + result);//Suma: 36
        //SUbtraction Oduzimanje
        result = result - 3; // 33
        System.out.println("Oduzimanje: " + result);//Oduzimanje: 33
        //Multiplication
        result = result * 2;
        System.out.println("MNOŽENJE: " + result); // 33*2=66
        //Division
        result = result / 3;
        System.out.println("DIJELJENJE: " + result);//22
        //MODULO
        result = result % 6;  //4
        System.out.println("Modulo result: " + result);

        char singleChar = 'W';
        String ime = "John";
        String prezime = "Doe";

    }
}
