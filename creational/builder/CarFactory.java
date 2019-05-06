package cn.ning.pattern.creational.builder;

/**
 * 指挥者。
 */
public class CarFactory {
    public Car createCar(){
        AudiBuilder audiBuilder = new AudiBuilder();
        Car car = new Car();
        car.setEngine(audiBuilder.buildEngine());
        car.setSeat(audiBuilder.buildSeat());
        car.setTyre(audiBuilder.buildTyre());
        car.setName(audiBuilder.buildName());
        return car;
    }
}
