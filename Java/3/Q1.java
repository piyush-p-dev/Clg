class Vehicle {
    String brand;
    String model;
    int year;

    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        this.fuelType = fuelType;
    }
}

class LuxuryCar extends Car {
    String feature;

    LuxuryCar(String brand, String model, int year,
            String fuelType, String feature) {
        super(brand, model, year, fuelType);
        this.feature = feature;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Feature: " + feature);
    }
}

public class Q1 {
    public static void main(String[] args) {
        LuxuryCar car = new LuxuryCar("Tesla", "Model S", 2023,
                "Electric", "Autopilot");

        car.displayDetails();
    }
}