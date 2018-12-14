//      The CarTest class makes sure the drive method of both cars returns the correct text.
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
    class CarTest {

        @Test
        void testManualCar() {
            Car car = new ManualCar("Audi");

            String message = car.drive();
            Assertions.assertEquals("Manual Audi", message);
        }

        @Test
        void testAutomaticCar() {
            Car car = new AutomaticCar("Audi");

            String message = car.drive();
            Assertions.assertEquals("Automatic Audi", message);
        }
    }
