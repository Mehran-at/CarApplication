public class AutomaticCar extends Car {

    @Override
    protected String getBrand() {
        return null;
    }

    @Override
    protected String drive() {
        return "Automatic";
    }

    public AutomaticCar(String brand) {
        super(brand);
    }
}
