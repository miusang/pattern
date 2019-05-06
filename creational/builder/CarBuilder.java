package cn.ning.pattern.creational.builder;

/**
 * 抽象建造者。
 */
public interface CarBuilder {
    String buildName();
    Engine buildEngine();
    Seat buildSeat();
    Tyre buildTyre();
}
