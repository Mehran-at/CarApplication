//      Hansel is considering buying a car. He decides to go to a car shop and try some of them until he finds the one he likes the most.
//      Consider the text below:
//          . There are two kinds of car: manual and automatic.
//          . A car has a brand.
//          . A car can drive. When it does, it returns a message saying “<car kind> <brand>”.
//      Follow the instructions below:
//       The Car class must be abstract. It has a brand that is given with the constructor. It has the drive method.
public abstract class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String drive() {
        return getType() + " " + brand;
    }

    protected abstract String getType();
}
