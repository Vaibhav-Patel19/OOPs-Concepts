package OOP.Abstraction;

public class WagonR extends Car {

    public void accelrate() {
        System.out.println("WagonR is accelrating.");
    }

    @Override // by writing compiler gets to know that this method is to be overwritten.
    public void breaking() {
        System.out.println("WagonR is Breaking. ");
    }
}
