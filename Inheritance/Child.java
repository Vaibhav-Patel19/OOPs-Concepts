package OOP.Inheritance;

public class Child {
    public static void main(String[] args) {
        Person p = new Person(18, "Vaibhav");

        Developer d = new Developer(20, "Abhi");
        d.walk();

        SDEONE s = new SDEONE(20, "Danis");
        s.walk();
    }
}

class Person{
    int age;
    String name;

    public Person(int age, String name){  // constructor
        this.age = age;
        this.name = name;
    }

    public void walk(){
        System.out.println(name + " is walking...");
    }
}

class Developer extends Person{

//    public void walk(){
//        System.out.println("Developer is walking...");
//    }

    public Developer(int age, String name) {
        super(age, name); //super keyword is used to call parent constructor.
    }
}

class SDEONE extends Developer{
    public SDEONE(int age, String name) {
        super(age, name);
    }
}