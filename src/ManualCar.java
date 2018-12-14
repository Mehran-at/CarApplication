//      The AutomaticCar and ManualCar classes extend from Car and add the necessary code.
public class ManualCar extends Car {
    public ManualCar(String brand) {
        super(brand);
    }

    @Override
    protected String getType() {
        return "Manual";
    }
}
