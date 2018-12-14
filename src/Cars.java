//      The Cars class has the getNextCar method that receives a brand and creates a random automatic or manual car to return it as a Car.
import java.util.Random;

public class Cars {
    private static Random random = new Random();
    public static Car getNextCar(String brand) {
        boolean automatic = random.nextBoolean();
        if (automatic) {
            return new AutomaticCar(brand);
        }
        return new ManualCar(brand);
    }
}
