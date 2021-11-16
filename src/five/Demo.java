package five;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        String name;
        int number = 23;
        number = 13;
        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 13;
        // 1. fiksna dužina niza
        // 2. svi unutar niza su istog tipa
        Person person = new Person();
        person.name = "Sani";
        person.surname = "Karić";
        person.age = 13;


        Person person2 = new Person();
        person2.name = "Jasna";
        person2.surname = "Pašić";
        person2.age = 12;

        String ime1 = "Adnan";
        String ime2 = "Adnan";
        String ime3 = new String("Adnan").intern();
        System.out.println(ime1 == ime2); // true
        System.out.println(ime1 == ime3); // false

    }
}
