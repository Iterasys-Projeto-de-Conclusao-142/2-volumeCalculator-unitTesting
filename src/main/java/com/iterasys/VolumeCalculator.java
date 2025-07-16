package com.iterasys;

public class VolumeCalculator {
    public double calculateCubeVolume(double sideLength) {
        return Math.pow(sideLength, 3);
    }

    public double calculateRectangularPrismVolume(double length, double width, double height) {
        return length * width * height;
    }

    public double calculateSphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}