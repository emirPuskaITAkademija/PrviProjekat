package eight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String inout = "23";
        int number = Integer.parseInt(inout);
        Box<Integer> kutija = new Box<>();
        kutija.setField(23);


        //polja niza indeksirana
        //Ograničenje 1: svi moraju biti String
        //Ograničenje 2: fiksna dužina niza...dinamičkih nizova
        String[] names = new String[3];
        names[0] = "Neila";
        names[1] = "Jasna";
        names[2] = "Selma";

        Person person = new Person();
        person.setName("Kerima");
        person.setSurname("Grabovica");
        person.setAge(13);

        //names, person -> sirovi složeni tipovi podataka
        Box<Person> box = new Box<>();
        box.setField(person);

        Box<String> box2 = new Box<>();
        box2.setField("Tekst....");

        //SIROVI RAW type
        Box box3 = new Box();
        box3.setField(new Object());

        ArrayList<Person> persons = new ArrayList<>();

        Box<Integer> box4 = new Box<>();
    }
}
