package OOP.Abstraction;
// Car is a concept and there is no need to create its object.
// So we declare such classes as Abstract, i.e. its objects cannot be created.
public abstract class Car {

    public abstract void accelrate();

    public abstract void breaking(); // We don't need to write definition of Abstract class methods, child who uses it
    // have to write its implementation.

    public void horn(){  // Concrete Method.
        System.out.println("Press Horn");
    }
}
