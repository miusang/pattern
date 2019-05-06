package cn.ning.pattern.creational.factory.abstractfactory;

public abstract class Car {
    Engine engine;
    Seat seat;
    Tyre tyre;
    void run() {
        engine.power();
        seat.feel();
        tyre.instructions();
    }
}
