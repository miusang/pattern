package cn.ning.pattern.creational.builder;

/**
 * 具体建造者。
 */
public class AudiBuilder implements CarBuilder{
    @Override
    public Tyre buildTyre() {
        Tyre tyre = new Tyre("高级轮胎");
        return tyre;
    }

    @Override
    public Seat buildSeat() {
        Seat seat = new Seat("舒适座椅");
        return seat;
    }

    @Override
    public String buildName() {
        return "奥迪车";
    }

    @Override
    public Engine buildEngine() {
        Engine engine = new Engine("动力强大发动机");
        return engine;
    }
}
