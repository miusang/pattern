package cn.ning.pattern.creational.factory.factorymethod;

public class BmwFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Bmw();
    }
}
