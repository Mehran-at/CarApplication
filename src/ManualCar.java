public class ManualCar extends Car {
    @Override
    protected String getBrand() {
        return null;
    }

    @Override
    protected String drive() {
        return "Manual";
    }

    public ManualCar(String brand) {
        super(brand);
    }
}
