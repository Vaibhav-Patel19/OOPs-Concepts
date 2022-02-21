package OOP.ComparablevsComparator;
// Comparable Interface
public class Student{
    String name;
    int marks;

    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name : " + name + " and Marks : " + marks;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

//    @Override
//    public int compareTo(Student o) {
//        if(this.marks > o.marks) return 1;
//        else if(this.marks < o.marks) return -1;
//
//        // IF marks are same then compare with name
//        return this.name.compareTo(o.name);
//    }
}
