package five;

/**
 * Modifikatori vidljivosti;
 * <li>1. public</li>
 * <li>2. private</li>
 * <li>3. protected</li>
 * <li>4. bez ključne riječi- paketna vidljivost</li>
 *
 *
 * Klasa outer -> public i paketnu vidljivost
 * <li>1. atribute ili polja ili properties</li>
 * <li>2. konstruktor</li>
 * <li>3. funkcije ili metode</li>
 */
 public class Person {
    public String name;
    public String surname;
    public int age;


    public Person(){
        System.out.println("Konstruisana instanca....");
    }

}
