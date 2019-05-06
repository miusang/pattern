package cn.ning.pattern.creational.factory.abstractfactory;

/**
 * 奥迪车。
 */
public class Audi extends Car {
    Audi(Engine engine, Seat seat, Tyre tyre) {
        this.engine = engine;
        this.seat = seat;
        this.tyre = tyre;
    }
    @Override
    public void run() {
        System.out.println("奥迪车在跑，整车运行情况如下：");
        super.run();
    }
}
