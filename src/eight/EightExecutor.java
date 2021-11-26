package eight;

import five.Person;
import seven.animal.Flyable;

public class EightExecutor {
    public static void main(String[] args) {
        //  new
        Person person = new Person();
        person.setName("Sead");
        //1.8 LAMBDA operator
        //ANONIMNI INNER TYPE 1.7
        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("I am flying...");
            }
        };
        flyable.fly();
        //1.8
        Flyable flyable2 = () -> {
            System.out.println("I am flying in Java 8 style...");
        };
        flyable2.fly();

    }
}
