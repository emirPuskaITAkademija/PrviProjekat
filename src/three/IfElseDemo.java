package three;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        //profesor unosi broj poena ostavernih na ispit
        System.out.println("Profa unesite broj poena nakon pregledanog ispita");
        int brojPoena = new Scanner(System.in).nextInt();
        char ocjena;
        if(brojPoena>=90){
            ocjena = 'A';//10
        }else if(brojPoena >=80){
            ocjena = 'B';//9
        }else if(brojPoena >= 70){
            ocjena = 'C';
        }else if(brojPoena >= 60){
            ocjena = 'D';
        }else if(brojPoena >= 50){
            ocjena = 'E';
        }else{
            ocjena = 'F';
        }
        System.out.println("Zaslužena ocjena je : " + ocjena);
    }
}
