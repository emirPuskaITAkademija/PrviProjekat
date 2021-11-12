package four.loop;

/**
 * <p>
 *     PETLJA - blok koda koji se izvršava sve dok je zadovoljen uslov petlje.
 * </p>
 * while(condition){    blok koda}
 */
public class WhileDemo {
    public static void main(String[] args) {
        int number = 11; // 1. početne uslove definirane kroz varijablu petlje
        while(number<=10){ // 2. uslov petlje izveden kroz varijablu petlje
            System.out.println(number);
            number++;//3. Korak petlje izveden takođe kroz varijablu petlje
        }
    }
}
