package OOP.Singleton;

public class MainClass {

    public static void main(String[] args)
    {
        Singleton obj = Singleton.getInstance();   //EveryTime it returns same Object
        Singleton ob2 = Singleton.getInstance(); // All pointing to same object
        Singleton ob3 = Singleton.getInstance();
    }
}
