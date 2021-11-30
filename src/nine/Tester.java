package nine;

import seven.Gender;
import seven.animal.Animal;
import six.Movie;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

//CILJ: jednom funkcijom zadovoljit šefa
public class Tester {
    public static void main(String[] args) {
        PersonReader personReader = new PersonReader();
        List<String> names = Arrays.asList("Sead", "Muamer", "Selma", "Ismar");
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Prohujalo s vihorom"));
        movies.add(new Movie("Kum"));
        movies.add(new Movie("X-Men"));
        //2.1 sirovi objektni tip

        List lista = new ArrayList();
        //2.2
        List<Person> personList = personReader.upitNaBazu();
        personList.stream()
                .filter(p->p.getGender().equals(Gender.MALE))
                .forEach(System.out::println);

//        procesElements(personList, p->true, p-> System.out.println(p));
//        procesElements(names, p->true, p-> System.out.println(p));
//        procesElements(movies, m->true, p-> System.out.println(p));

        //printPersons(personList);
        //printPersonsOlderThan(personList, 20);
        //printPersonsWithGender(personList, Gender.MALE);
//        printPersonsWithinAges(personList, 20, 30);

    }

    private static <T> void procesElements(List<T> elements, Predicate<T> tester, Consumer<T> procesor){

        //Iterator
//        for(T element: elements){
//            if(tester.test(element)){
//                procesor.accept(element);
//            }
//        }
        //Spliterator -> Stream Brian Goetz... procesiranje elemenata unutar neke kolekcije
        /*
            1. izvor stream
            2. intermediate operations ili međuoperacije -> filter
            3. terminate operation -> forEach
         */
       // Movie movie = new Movie().setDirector("Maximialn").setTitle("Kum");


        elements.stream()
                .filter(tester)
                .forEach(procesor);


    }

//    private static <T> void printElements(List<T> elements, Testable<T> tester){
//        for(T element: elements){
//            if(tester.test(element)){
//                System.out.println(element);
//            }
//        }
//    }

//    private static void printPeople(List<Person> personList, PersonTester personTester){
//        for(Person person: personList){
//            if(personTester.test(person)){
//                System.out.println(person);
//            }
//        }
//    }
//
//    private static void printPersons(List<Person> personList){
//        for(Person person : personList){
//            System.out.println(person);
//        }
//    }
//
//    private static void printPersonsOlderThan(List<Person> personList, int age){
//        for(Person person : personList){
//            if(person.getAge()>=age){
//                System.out.println(person);
//            }
//        }
//    }
//
//    private static void printPersonsWithGender(List<Person> personList, Gender gender){
//        for(Person person : personList){
//            if(person.getGender().equals(gender)){
//                System.out.println(person);
//            }
//
//        }
//    }
//
//    private static void printPersonsWithinAges(List<Person> personList, int min, int max){
//        for(Person person : personList){
//            int age = person.getAge();
//            if(age >=min && age <=max){
//                System.out.println(person);
//            }
//        }
//    }
}
