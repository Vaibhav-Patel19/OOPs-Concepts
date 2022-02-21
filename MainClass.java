package OOP;

import OOP.packages.Teacher;
import OOP.packages.models.Student;

class MyConstructor{

    int wheels;
    int headlights;

    MyConstructor(int wheels){

        this.wheels = wheels;
        headlights = 2;

    }
}

class Cat{

    String breed;
    int age;

    public void walk(){
        System.out.print("Walk");
    }
    public int ReturnAge()
    {
        return age;
    }
}

public class MainClass {

    public static void main(String[] args){

        Cat cat1 = new Cat();
        cat1.age = 10;

        System.out.print(cat1.ReturnAge());

        Student std = new Student();
        Teacher T = new Teacher();

    }

}
