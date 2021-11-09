package three;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        //TIP varijabla = vrijednost;
        int number1 = 23;
        //SLOŽENI TIP PODATKA
        //1. način konstrukcije niza
        //Shift + F6
        //Shift + Fn + F6
        int[] brojevi = new int[3];
        System.out.println("Unesi prvi broj");
        brojevi[0] = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj");
        brojevi[1] = new Scanner(System.in).nextInt();
        System.out.println("Unesi treći broj");
        brojevi[2] = new Scanner(System.in).nextInt();
        System.out.println(brojevi[0] + ", " + brojevi[1] + ", " + brojevi[2]);
        //Drugi način
        int[] drugiNiz = {23, 13, 133};

    }
}
