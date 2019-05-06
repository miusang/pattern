package cn.ning.pattern.creational.builder;

/*
 * 建造者模式。
 *     |--- Builder : 抽象建造者
 *     |--- ConcreteBuilder : 具体建造者
 *     |--- Director : 指挥者
 *     |--- Product : 产品角色
 *
 * 定义：
 *     将一个负责对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *
 * 适用场景：
 *     1. 生成对象具有复杂的内部结构；
 *     2. 生成对象内部属性本身相互依赖。
 *
 * 优点：
 *     1. 建造者独立，易扩展；
 *     2. 便于控制细节风险。
 * 缺点：
 *     1. 产品必须有共同点，范围有限制；
 *     2. 如果内部变化复杂，会有很多的建造类。
 *
 */
public class Demo {
    public static void main(String[] args) {
        Car car = new CarFactory().createCar();
        car.run();
    }
}
