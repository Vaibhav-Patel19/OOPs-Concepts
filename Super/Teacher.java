package OOP.Super;

public class Teacher extends Person {

    public Teacher(){
        super();
        System.out.println("Child class ");
    }
    public void teach(){
        System.out.println(super.name + " is teaching.");
    }
}
