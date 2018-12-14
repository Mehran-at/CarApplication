//      The CarApplication creates one Hansel and using the Cars class tries 10 cars.
import java.util.Arrays;
import java.util.List;

public class CarApplication {
    public static void main(String[] args) {
    Hansel hansel = new Hansel();
    String[] split = "Audi, Mercedes, Seat, Skoda, Tesla, Bmw, Peugeot, Citroen, Jeep, Ferrari".split(", ");
    List<String> brands = Arrays.asList(split);
    for (String brand : brands) {
        Car car = Cars.getNextCar(brand);
        hansel.haveATry(car);
        }
    }
}
