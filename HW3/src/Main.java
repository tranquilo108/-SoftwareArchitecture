//Спроектировать абстрактный класс «Cars.Car» у которого должны быть свойства: марка, модель, цвет, тип кузова, число колёс, тип топлива, тип коробки передач, объём двигателя; методы: движение, обслуживание, переключение передач, включение фар, включение дворников.
//Создать конкретный автомобиль путём наследования класса «Cars.Car».
// Расширить абстрактный класс «Cars.Car», добавить метод: подметать улицу. Создать конкретный автомобиль путём наследования класса «Cars.Car». Провести проверку принципа SRP.
// Расширить абстрактный класс «Cars.Car», добавить метод: включение противотуманных фар, перевозка груза. Провести проверку принципа OCP.
// Создать конкретный автомобиль путём наследования класса «Cars.Car», определить число колёс = 3. Провести проверку принципа LSP.


import Cars.*;

public class Main {
    public static void main(String[] args) {

        Car mycar = new Toyota("Camry", "blue", "sidan", "petrol", "auto", 4, 2.5);


        Car sweeper = new StreetSweeper("ЗИЛ-164", "КМП-2", "blue", "truck", "diesel", "mechanical", 6, 5.5);
        ((StreetSweeper) sweeper).sweepStreet();


        Car truck = new Truck("unknown","unknown","unknown","unknown","unknown","unknown",5,5);
        ((Truck) truck).isCargoLoad();
        ((Truck) truck).isCargoLoad();
        ((Truck) truck).isFogLights();
        ((Truck) truck).isFogLights();


        Car tricycle = new Tricycle("unknown","unknown","unknown","unknown","unknown","unknown", 22);
        System.out.println(((Tricycle) tricycle).getNuberOfWheels());


        Car bat = new BatMobile("BruceWayneIndustries", "Bat 3.0", "black", "incredicle", "uranium-238", "atomic " +
                "reactor", 0, 55);
        ((BatMobile) bat).driving();

        Car mercedes = new Mercedes("AMG GT", "white", "LiftBack", "auto","Бензин" , 4, 4.0);
        Car mercedesDiesel = new Mercedes("GLE", "grey", "SUV", "auto","Дизель" , 4, 2.0);
        ((Mercedes) mercedes).refueling();
        ((Mercedes) mercedesDiesel).refueling();

//        Cars.Toyota myCar = new Cars.Toyota("Camry", "blue", "sedan", "бензин", "Auto", 4, 2.5);
//        Cars.Toyota myCar2 = new Cars.Toyota("Camry", "blue", "sedan", "бензин", "Auto", 3, 2.5);
    }
}