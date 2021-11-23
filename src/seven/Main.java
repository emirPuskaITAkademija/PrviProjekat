package seven;

import seven.animal.*;
import seven.human.Employee;
import seven.human.Person;
import seven.human.Professor;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Dog dog = new Dog();
        professor.setAnimal(dog);
        Cat cat = new Cat();//Object, Cat
        professor.setAnimal(cat);
        Fish fish = new Fish();
        fish.setType("Šaran");
        professor.setAnimal(fish);
        Fish fish1 = new Fish();
        fish1.setName("Pastrmka");
        fish1.setType("Pastrmka");
        professor.setAnimal(fish1);
        System.out.println(professor.getAnimal().getName());
        Hamster hamster = new Hamster();
        professor.setAnimal(hamster);

        Bird bird = new Bird();
        professor.setAnimal(bird);




    }
}
