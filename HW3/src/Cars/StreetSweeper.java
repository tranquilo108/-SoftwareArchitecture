package Cars;

import Interfaces.iSweep;

/**
 * Расширенный класс автомобиль подметающий улицу унаследованный от абстрактного класса Car
 */
public class StreetSweeper extends Car implements iSweep {

    public StreetSweeper(String brand, String model, String color, String bodyType, String fuelType, String gearboxType, int numberOfWheels, double engineSize) {
        super(brand, model, color, bodyType, fuelType, gearboxType, numberOfWheels, engineSize);
    }
    public void sweepStreet() {
        System.out.println("I am " + getClass().getCanonicalName().split("\\.")[1] + " and i sweeping the street");
    }
}
