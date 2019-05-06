package cn.ning.pattern.creational.factory.simplefactory;

public class CarFactory {
    public static Car createCar(String car_name) {
        if (car_name.equalsIgnoreCase("Audi")) {
            return new Audi();
        }
        if (car_name.equalsIgnoreCase("Bmw")) {
            return new Bmw();
        }
        if (car_name.equalsIgnoreCase("Honda")) {
            return new Honda();
        }
        return null;
    }
}
