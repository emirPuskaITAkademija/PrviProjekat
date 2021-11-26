package eight.collection;

import seven.Gender;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
//        Person p1 = new Person("Jasna", "Ibrahimpašić", Gender.FEMALE, 13);
//        persons.add(p1);//123
//        persons.add(p1);//123
//        Person p12 = new Person("Jasna", "Ibrahimpašić", Gender.FEMALE, 13);
//        persons.add(p12);//345
//
//        Person p2 = new Person("Kerima", "Grabovica", Gender.FEMALE, 14);
//        persons.add(p2);
//        Person p3 = new Person("Vedad", "Muratović", Gender.MALE, 9);
//        persons.add(p3);
//        Person p4 = new Person("Tarik", "Dedić", Gender.MALE, 23);
//        persons.add(p4);
//        Person p5 = new Person("Amar", "Smajić", Gender.MALE, 23);
//        persons.add(p5);
//        Person p6 = new Person("Ajdin", "Sinanović", Gender.MALE, 43);
//        persons.add(p6);
//        Person p7 = new Person("Neila", "Hasanović", Gender.FEMALE, 6);
//        persons.add(p7);
//        Person p8 = new Person("Anoniman", "Anonimus", Gender.MALE, 63);
//        persons.add(p8);
        for(Person person: persons){
            System.out.println(person);
        }

    }
}
