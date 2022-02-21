package OOP.Constructor;
// Constructors are used for creating new objects.
public class Constructors {
    public static class Person{
        int age;
        String name;

        public Person(int age, String name){  // constructor
            this(); // this keyword is used to call one constructor from another.
            this.age = age;
            this.name = name;
        }

        public Person(){
            System.out.println("Constructor called");
        }
    }
    public static void main(String[] args) {
        Person p = new Person(10, "Vaibhav Patel");
    }
}

