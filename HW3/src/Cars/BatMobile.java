package Cars;

/**
 * Расширенный класс автомобиля с методом движения - полёт унаследованный от абстрактного класса Car
 */
public class BatMobile extends Car{

    public BatMobile(String brand, String model, String color, String bodyType, String fuelType, String gearboxType, int numberOfWheels, double engineSize) {
        super(brand, model, color, bodyType, fuelType, gearboxType, numberOfWheels, engineSize);
    }
    @Override
    public void driving(){
        System.out.println("Автомобиль летит");
    }
}
