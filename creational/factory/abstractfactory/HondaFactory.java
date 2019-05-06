package cn.ning.pattern.creational.factory.abstractfactory;

/**
 * 本田车工厂。
 */
public class HondaFactory implements CarFactory {

    @Override
    public Car createCar() {

        Engine engine = new NormalEngine();
        Seat seat = new CheapSeat();
        Tyre tyre = new PirelliTyre();
        System.out.println("生产一辆本田车。");
        return new Honda(engine, seat, tyre);
    }
}
