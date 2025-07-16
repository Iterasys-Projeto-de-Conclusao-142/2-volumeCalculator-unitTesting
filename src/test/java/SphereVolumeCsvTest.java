import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.iterasys.VolumeCalculator;

public class SphereVolumeCsvTest {
    VolumeCalculator calculator = new VolumeCalculator();

    @ParameterizedTest
    @CsvFileSource(resources = "/sphereVolumeData.csv", numLinesToSkip = 1, delimiter = ',')
    public void testSphereVolumeFromCSV(double radius, double expectedVolume) {
        double result = calculator.calculateSphereVolume(radius);

        assertEquals(expectedVolume, result, 0.0001);
    }
}
