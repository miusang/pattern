package cn.ning.pattern.creational.factory.factorymethod;

public class HondaFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Honda();
    }
}
