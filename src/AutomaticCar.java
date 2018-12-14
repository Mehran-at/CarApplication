//      The AutomaticCar and ManualCar classes extend from Car and add the necessary code.
public class AutomaticCar extends Car {
    public AutomaticCar(String brand) {
        super(brand);
    }

    @Override
    protected String getType() {
        return "Automatic";
    }

}
