package cn.ning.pattern.creational.factory.abstractfactory;

/**
 * 本田车。
 */
public class Honda extends Car {
    Honda(Engine engine, Seat seat, Tyre tyre) {
        this.engine = engine;
        this.seat = seat;
        this.tyre = tyre;
    }
    @Override
    public void run() {
        System.out.println("本田车在跑，整车运行情况如下：");
        super.run();
    }
}
