package cn.ning.pattern.structural.flyweight;

/*
 * 享元模式。
 *     |--- Flyweight : 抽象享元类
 *     |    通常是一个接口或者抽象类，声明公共方法，这些方法可以向外界提供对象的内部状态，设置外部状态。
 *     |
 *     |--- ConcreteFlyweight : 具体享元类
 *     |    为内部状态提供成员变量进行存储。
 *     |
 *     |--- UnsharedConcreteFlyweight : 非共享具体享元类
 *     |    不能被共享的子类可以设计为非共享享元类。
 *     |
 *     |--- FlyweightFactory : 享元工厂类
 *     |    创建并管理享元对象，享元池一般设计成键值对。
 *
 * 定义：
 *     运用共享技术有效地支持大量细粒度对象的复用。系统只使用少量的对象，而这些对象都很相似，状态变化很小，可以实现对象的
 *     多次复用。由于享元模式要求能够共享的对象必须是细粒度对象，因此它又称轻量级模式。
 *
 * 适用场景：
 *     1. 系统有大量相似对象。
 *     2. 需要缓冲池的场景。
 *
 * 优点：
 *     大大减少对象的创建，降低系统的内存，使效率提高。
 * 缺点：
 *     提高了系统的复杂度，需要分离出外部状态和内部状态，而且外部状态具有固有化的性质，不应该随着内部状态的变化而变化，
 *     否则会造成系统的混乱。
 *
 */
public class Demo {
    public static void main(String[] args) {
        Soldier xiaobing = SoldierFactory.getSoldier(0);
        Soldier paoche = SoldierFactory.getSoldier(1);
        Soldier chaojibing = SoldierFactory.getSoldier(2);
        xiaobing.display(new Position(0, 20));
        paoche.display(new Position(1, 211));
        chaojibing.display(new Position(2, 124));
        Soldier xiaobing2 = SoldierFactory.getSoldier(0);
        System.out.println(xiaobing == xiaobing2);
    }
}
