package Cars;
/**
 * Абстрактный класс Car со свойствами:
 * String - brand, model, color, bodyType, fuelType, gearboxType
 * int - numberOfWheels, engineSize
 * Методами:
 * void - maintenance, gearShifting, headlightsOn, wipersOn
 */
public abstract class Car{
    protected String brand, model, color, bodyType, fuelType, gearboxType;
    protected int numberOfWheels;
    protected double engineSize;

    public Car(String brand, String model, String color, String bodyType, String fuelType, String gearboxType,
               int numberOfWheels, double engineSize) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.fuelType = fuelType;
        this.gearboxType = gearboxType;
        this.numberOfWheels = numberOfWheels;
        this.engineSize = engineSize;
    }

    protected void driving(){

    }
    protected void maintenance(){

    }
    protected void gearShifting(){

    }
    protected void headlightsOn(){

    }
    protected void wipersOn(){

    }
}