package Cars;

import Interfaces.*;

/**
 * Расширенный класс автомобиля унаследованный от абстрактного класса Car с методами:
 * включение противотуманных фар, перевозка груза
 */
public class Truck extends Car implements iFogLights, iTransportation {
    private boolean fogLights;
    private boolean cargo;
    public Truck(String brand, String model, String color, String bodyType, String fuelType, String gearboxType, int numberOfWheels, double engineSize) {
        super(brand, model, color, bodyType, fuelType, gearboxType, numberOfWheels, engineSize);
        fogLights = false;
        cargo = false;
    }

    @Override
    public void isFogLights() {
        if(fogLights){
            fogLights = false;
            System.out.println("Противотуманные фары выключены");
        }else {
            fogLights = true;
            System.out.println("Противотуманные фары включены");
        }
    }

    @Override
    public void isCargoLoad() {
        if(cargo){
            cargo = false;
            System.out.println("Погрузка завершена. Можно везти до пункта назначения");
        }else {
            cargo = true;
            System.out.println("Разгрузка завершена. Можно искать новый заказ");
        }
    }
}
