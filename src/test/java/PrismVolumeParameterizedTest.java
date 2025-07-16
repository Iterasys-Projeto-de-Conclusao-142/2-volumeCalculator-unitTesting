import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.iterasys.VolumeCalculator;

public class PrismVolumeParameterizedTest {
    VolumeCalculator calculator = new VolumeCalculator();

    @ParameterizedTest
    @CsvSource({
        "2, 3, 4, 24",
        "1.5, 2, 2, 6",
        "5, 5, 5, 125"
    })
    public void testRectangularPrismVolume(double length, double width, double height, double expected) {
        double result = calculator.calculateRectangularPrismVolume(length, width, height);

        assertEquals(expected, result);
    }
}
