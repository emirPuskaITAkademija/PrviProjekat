package nine;

import seven.Gender;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person implements Comparable<Person>{
    private int id;
    private String name;
    private String surname;
    private Gender gender;
    //year, month, day
    private LocalDate birthday;

    public Person() {
    }

    public Person(int id, String name, String surname, Gender gender, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName() {

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period period = birthday.until(now);
        int age = period.getYears();
        return age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    //Person p1 = new Person();
    //Person p2 = new Person();
    //Animal a1 = new Dog();
    //p1.equals(a1);
    //p1.equals(p1)
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person)){
            return false;
        }
        Person comparedPerson = (Person)obj;
        return id == comparedPerson.getId()
                && this.name.equals(comparedPerson.getName())
                && surname.equals(comparedPerson.getSurname())
                && gender.equals(comparedPerson.getGender())
                && birthday.equals(comparedPerson.getBirthday());
    }

    @Override
    public int hashCode() {
        int hashCode = Objects.hash(id, name, surname, gender, birthday);
        return hashCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" ");
        sb.append(surname);
        sb.append(",");
        sb.append(gender);
        sb.append(", birthday:");
        sb.append(birthday);
        return sb.toString();
    }

    //p1.compareTo(p2)
    @Override
    public int compareTo(Person comparedPerson) {

        //-1 p1 manji od p2
        //0 p1 jednak p2
        // +1 p1 veći od p2
        int result = name.compareTo(comparedPerson.getName());
        if(result == 0){
            result = surname.compareTo(comparedPerson.getSurname());
//            result = birthday.compareTo(comparedPerson.getBirthday());
        }
        if(result == 0){
          result = birthday.compareTo(comparedPerson.getBirthday());
        }
        return result;
    }
}
