package OOP.Interface;

public class Person implements Actor,Student{

    public void study() {
        System.out.println("Student is studying.");
    }

    public void act() {
        System.out.println("Actor is studying.");
    }

    public static void main(String[] args){

        Person p = new Person();
        p.act();
        p.study();


    }
}
