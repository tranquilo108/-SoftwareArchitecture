package Cars;

import Interfaces.*;

/**
 * Расширенный класс автомобиля с имплементацией всех методов интерфейса iGasStation
 * унаследованный от абстрактного класса Car
 */
public class Mercedes extends Car implements iGasStation{

    public Mercedes(String model, String color, String bodyType, String gearboxType,String fuelType,
                    int numberOfWheels,
                    double engineSize) {
        super("Mercedec", model, color, bodyType, fuelType, gearboxType, numberOfWheels, engineSize);
    }

    @Override
    public void refueling() {
        System.out.println("Заправка " + fuelType + " прошла успешно");
    }

    @Override
    public void windshieldCleaning() {
        System.out.println("Стекло очищено");
    }

    @Override
    public void headlightCleaning() {
        System.out.println("Фары очищены");
    }

    @Override
    public void mirrorCleaning() {
        System.out.println("Зеркала очищены");
    }
}
