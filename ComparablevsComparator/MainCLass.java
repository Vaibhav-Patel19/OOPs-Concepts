package OOP.ComparablevsComparator;

import java.util.*;

public class MainCLass {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Vaibhav", 99));
        list.add(new Student("Patel", 79));
        list.add(new Student("David", 89));
        list.add(new Student("Manav", 99));

        // List of Object that implements Comparable, Comparator interface can be sorted by Collections.sort,
//        Collections.sort(list, new  sortByMarks()); // <- One way of using comparator

//        Collections.sort(list, new Comparator<Student>(){ // <- Second way of using comparator
//            @Override
//            public int compare(Student one, Student two){
//                if(one.marks == two.marks){
//                    return one.name.compareTo(two.name);
//                }
//                return one.marks - two.marks;
//            }
//        });

//        Collections.sort(list, (one, two) -> { // <- Third way of using comparator, lambda style
//            if(one.marks == two.marks) // Sorted according to marks
//                return one.name.compareTo(two.name);
//            return one.marks - two.marks;
//        });

//        Collections.sort(list, (one, two) -> one.name.compareTo(two.name)); // Sorting by Name

        Collections.sort(list, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));
        // Sorting by Name then marks
        Collections.sort(list, Comparator.comparing(one -> one.name)); // getName is not defined

        Collections.sort(list, Comparator.comparing(Student::getMarks).reversed()); // Descending Order




        list.forEach(System.out::println);// lambda style
    }
}

// Comparator
//class sortByMarks implements Comparator<Student>{
//    public int compare(Student one, Student two){
//        if(one.marks == two.marks){
//            return one.name.compareTo(two.name);
//        }
//        return one.marks - two.marks;
//    }
//}