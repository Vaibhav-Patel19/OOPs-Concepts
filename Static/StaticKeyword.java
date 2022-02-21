package OOP.Static;
// Static keyword is used for creating properties of a class.
// Used to access properties of a class without creating its object.
// Eg. Like its used in main method, you don't need to create object of Main Class.
// Eg. Like you want to create some features which are specific for class and not objects.
// Like, count of person objects created of Person Class.
public class StaticKeyword {
    public static void main(String[] args) {
        Person p = new Person();
    }
}

class Person{
    int age;
    public Person(){
        System.out.println("Default Constructor is loaded");
    }
    public Person(int age){
        this.age = age;
        System.out.println("Age Constructor!");
    }
}
