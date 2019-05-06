package cn.ning.pattern.creational.builder;

/**
 * 产品角色。
 */
public class Car {
    private Engine engine; // 发动机。
    private Seat seat; // 座椅。
    private Tyre tyre; // 轮胎。
    private String name;
    public void run(){
        System.out.println(this.name + "汽车在跑，整车运行情况如下：");
        System.out.println(engine.name);
        System.out.println(seat.name);
        System.out.println(tyre.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
}

class Engine {
    public String name;
    Engine(String name) {
        this.name = name;
    }
}
class Seat {
    public String name;
    Seat(String name) {
        this.name = name;
    }
}
class Tyre {
    public String name;
    Tyre(String name) {
        this.name = name;
    }
}