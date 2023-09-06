package Cars;

/**
 * Конкретный класс автомобиля унаследованный от абстрактного класса Car
 */
public class Toyota extends Car {
    public Toyota(String model, String color, String bodyType, String fuelType, String gearboxType, int numberOfWheels, double engineSize) {
        super("Toyota", model, color, bodyType, fuelType, gearboxType, numberOfWheels, engineSize);
    }
}