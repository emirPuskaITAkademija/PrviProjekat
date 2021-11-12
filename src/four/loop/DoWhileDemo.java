package four.loop;

public class DoWhileDemo {
    public static void main(String[] args) {
        int number = 1;//1. početne uslove petlje
        do{
            System.out.println("Broj je: "  + number);
            number++;// 2. Korak petlje ili inkrement
        }while (number<=5); //3. Uslov petlje
    }
}
