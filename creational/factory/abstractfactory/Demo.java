package cn.ning.pattern.creational.factory.abstractfactory;

/*
 * 抽象工厂模式。
 *     |--- AbstractFactory : 抽象工厂 1+
 *     |    声明了一组用于创建对象的方法，注意是一组。
 *     |
 *     |--- ConcreteFactory : 具体工厂 1+
 *     |    它实现了在抽象工厂中声明的创建对象的方法，生成一组具体对象。
 *     |
 *     |--- AbstractProduct : 抽象产品 1+
 *     |    它为每种对象声明接口，在其中声明了对象所具有的业务方法。
 *     |
 *     |--- Product : 具体产品 1+
 *     |    它定义具体工厂生产的具体对象。
 *
 * 定义：
 *     提供一个创建一系列相关或者相互依赖对象的接口，而无须指定他们具体的类。不能增加产品，可以增加产品族。
 *
 * 适用场景：
 *     1. 和工厂方法一样，客户端不知道它所创建对象的类；
 *     2. 需要一组对象共同完成某种功能时；
 *     3. 系统结构稳定，不会频繁的增加对象。
 *
 * 优点：
 *     1. 抽象工厂模式隔离了具体类的生成，使得客户并不需要知道什么被创建。
 *     2. 当一个产品族中的多个对象被设计成一起工作时，它能够保证客户端始终只使用同一个产品族中的对象。
 *        这对一些需要根据当前环境来决定其行为的软件系统来说，是一种非常实用的设计模式。
 *     3. 增加新的具体工厂和产品族很方便，无须修改已有系统，符合“开闭原则”。
 * 缺点：
 *     1. 在添加新的产品对象时，难以扩展抽象工厂来生产新种类的产品，这是因为在抽象工厂角色中规定了所有可能被创建的产
 *        品集合，要支持新种类的产品就意味着要对该接口进行扩展，而这将涉及到对抽象工厂角色及其所有子类的修改，
 *        显然会带来较大的不便。
 *     2. 开闭原则的倾斜性(增加新的工厂和产品族容易，增加新的产品等级结构麻烦)。
 */
public class Demo {
    public static void main(String[] args) {
        CarFactory carFactory = new AudiFactory();
        Car car = carFactory.createCar();
        car.run();
        System.out.println();
        carFactory = new HondaFactory();
        car = carFactory.createCar();
        car.run();
    }
}
