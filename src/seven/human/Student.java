package seven.human;

import seven.Gender;
import seven.animal.Dog;

public class Student extends Person{

    private String indexNumber;

    public Student(){
        super();
        System.out.println("Student...");
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }
}
