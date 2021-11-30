package nine;

import seven.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonReader {

    public List<Person> upitNaBazu(){
        List<Person> personList = new ArrayList<>();
        LocalDate p1Birthday = LocalDate.of(2000, 11, 12);
        Person p1 = new Person(123, "Kerima", "Grabovica", Gender.FEMALE, p1Birthday);
        personList.add(p1);
        personList.add(p1);
        personList.add(p1);
        personList.add(new Person(123, "Kerima", "Grabovica", Gender.FEMALE, LocalDate.of(2000, 11, 12)));
        personList.add(new Person(456, "Jasna", "Ibrahimpašić", Gender.FEMALE, LocalDate.of(2009, 1, 1)));
        personList.add(new Person(111, "Vedad", "Muratović", Gender.MALE, LocalDate.of(1999, 5, 12)));
        personList.add(new Person(3435, "Tarik", "Dedić", Gender.MALE, LocalDate.of(1997, 3, 12)));
        personList.add(new Person(123, "Ajla", "Reiz", Gender.FEMALE, LocalDate.of(2010, 11, 12)));
        personList.add(new Person(123, "Kerima", "Grabovica", Gender.FEMALE, LocalDate.of(2000, 3, 4)));
        personList.add(new Person(123, "Kerima", "Grabovica", Gender.FEMALE, LocalDate.of(2000, 11, 12)));
        personList.add(new Person(123, "Kerima", "Grabovica", Gender.FEMALE, LocalDate.of(2000, 11, 12)));
        personList.add(new Person(123, "Kerima", "Grabovica", Gender.FEMALE, LocalDate.of(2000, 11, 12)));
        personList.add(new Person(123, "Kerima", "Grabovica", Gender.FEMALE, LocalDate.of(2000, 11, 12)));
        personList.add(new Person(123, "Kerima", "Grabovica", Gender.FEMALE, LocalDate.of(2000, 11, 12)));
        personList.add(new Person(123, "Kerima", "Grabovica", Gender.FEMALE, LocalDate.of(2000, 11, 12)));
        personList.add(new Person(123, "Kerima", "Grabovica", Gender.FEMALE, LocalDate.of(2000, 11, 12)));
        personList.add(new Person(123, "Kerima", "Grabovica", Gender.FEMALE, LocalDate.of(2000, 11, 12)));
        personList.add(new Person(123, "Kerima", "Grabovica", Gender.FEMALE, LocalDate.of(2000, 11, 12)));
        personList.add(new Person(123, "Kerima", "Grabovica", Gender.FEMALE, LocalDate.of(2000, 11, 12)));
        personList.add(new Person(123, "Kerima", "Grabovica", Gender.FEMALE, LocalDate.of(2000, 11, 12)));
        personList.add(new Person(123, "Kerima", "Dizdarević", Gender.FEMALE, LocalDate.of(2000, 11, 12)));

        return personList;
    }
}
