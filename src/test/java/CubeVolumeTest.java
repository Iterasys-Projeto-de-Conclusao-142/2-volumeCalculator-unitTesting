import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.iterasys.VolumeCalculator;

public class CubeVolumeTest {
    VolumeCalculator calculator = new VolumeCalculator();

    @Test
    public void testCubeVolume() {
        double side = 3.0;
        double expected = 27.0;
        double result = calculator.calculateCubeVolume(side);

        assertEquals(expected, result);
    }
}
