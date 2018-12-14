public abstract class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    protected abstract String getBrand();

    protected abstract String drive();
}
