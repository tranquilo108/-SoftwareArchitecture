package Cars;

/**
 * Расширенный класс автомобиль с тремя колёсами унаследованный от абстрактного класса Car
 */
public class Tricycle extends Car{
    public Tricycle(String brand, String model, String color, String bodyType, String fuelType, String gearboxType,
                    double engineSize) {
        super(brand, model, color, bodyType, fuelType, gearboxType, 3, engineSize);
    }

    public int getNuberOfWheels(){
        return this.numberOfWheels;
    }
}
