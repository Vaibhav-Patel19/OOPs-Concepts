package OOP.Polymorphism;

public class MainClass {

//    2 types of Polymorphism:
//        1 - Compile Time ( Based on Arguments )
//        2 - Runtime

    public static void main(String[] args)
    {
        Dog d = new Dog();

        Pet p = d;
        Animal a = d;
        Animal b = new Pet();

        d.walk();
        p.walk(); // Runtime Polymorphism
        a.walk(); // Runtime
        b.walk(); // Runtime
    }
}
