package cn.ning.pattern.creational.factory.abstractfactory;

/**
 * 奥迪车工厂。
 */
public class AudiFactory implements CarFactory {

    @Override
    public Car createCar() {
        Engine engine = new PowerfulEngine();
        Seat seat = new AdvancedSeat();
        Tyre tyre = new MichelinTyre();
        System.out.println("生产一辆奥迪车。");
        return new Audi(engine, seat, tyre);
    }
}
