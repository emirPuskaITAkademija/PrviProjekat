package eight.collection;

import eight.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExecutor {
    public static void main(String[] args) {
        Person pe = new Person();
        //svi unutar niza personArray su tipa Person
        String[] personArray = new String[3];
        personArray[0] = "Omer";
        personArray[1] = "Ismar";
        personArray[2] = "Berin";
        for(String name: personArray){
            System.out.println(name);
        }
        System.out.println("......");
        //svi unutar objekat personArrayList su kojeg tipa Person
        List<String> personArrayList = new ArrayList<>();
        personArrayList.add("Omer");
        personArrayList.add("Omer");
        personArrayList.add("Ismar");
        personArrayList.add("Berin");
        personArrayList.add("Kerima");
        personArrayList.add("Jasna");
        personArrayList.add("Neila");
        for(String name: personArrayList){
            System.out.println(name);
        }
        NaturalNumber naturalNumber = new NaturalNumber();
//        for(Integer number: naturalNumber){
//
//        }
    }
}
