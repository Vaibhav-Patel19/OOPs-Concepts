package OOP.Encapsulation;

public class Student {

    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age < 18)
            System.out.println("You are not eligible");
        else
            this.age = age;
    }
}
