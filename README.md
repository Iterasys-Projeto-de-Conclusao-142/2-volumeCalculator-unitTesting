# Volume Calculator | Java + JUnit 5 Testing Project

This project implements a simple volume calculator in **Java** with automated unit tests using **JUnit 5**.

## Structure

- **src/main/java/com/iterasys/VolumeCalculator.java**  
  Core class containing methods to calculate volumes for cube, rectangular prism, and sphere.

- **src/test/java/CubeVolumeTest.java**  
  Unit test for cube volume using static test data.

- **src/test/java/PrismVolumeParameterizedTest.java**  
  Parameterized test for rectangular prism volume using inline test data.

- **src/test/java/SphereVolumeCsvTest.java**  
  Parameterized test for sphere volume using test data from a CSV file.

- **src/test/resources/sphereVolumeData.csv**  
  CSV file containing radius and expected volume for sphere test cases.

## How it works

1. **Cube Volume Calculation**  
   The `CubeVolumeTest` class tests `calculateCubeVolume(side)`, asserting the result for a given side length.

2. **Rectangular Prism Volume Calculation**  
   The `PrismVolumeParameterizedTest` class runs multiple test cases using a CSV source defined inline to test `calculateRectangularPrismVolume(length, width, height)`.

3. **Sphere Volume Calculation**  
   The `SphereVolumeCsvTest` class reads test data from `sphereVolumeData.csv` and verifies the result of `calculateSphereVolume(radius)` with a tolerance for floating-point precision.

## How to run

1. Make sure you have Java and Maven installed.
2. Run the tests with Maven:

   ```bash
   mvn clean test


---

Project developed for learning purposes in unit tests. 