package OOP.WrapperClass;

public class MainClass {
    public static void main(String[] args) {

        int i = 1; // Primitive Data type variable
        Integer j = 1; // Integer Object Class

        Integer k = new Integer(i); // Idea of putting primitive value inside an object is called boxing
        Integer ii = i; //auto-boxing

        int jj = j.intValue(); // Unboxing
        int kk = j; //Auto unboxing
    }
}
