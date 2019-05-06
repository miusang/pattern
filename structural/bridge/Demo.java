package cn.ning.pattern.structural.bridge;

/*
 * 桥接模式。
 *     |--- Abstraction : 抽象类
 *     |    定义抽象接口，拥有一个Implementor类型的对象引用。
 *     |
 *     |--- RefinedAbstraction : 扩充抽象类
 *     |    扩展Abstraction中的接口定义。
 *     |
 *     |--- Implementor : 实现类接口
 *     |    是具体实现的接口，Implementor和RefinedAbstraction接口并不一定完全一致，实际上这两个接口可以完全不一样
 *     |    Implementor提供具体操作方法，而Abstraction提供更高层次的调用。
 *     |
 *     |--- ConcreteImplementor : 具体实现类
 *     |    实现Implementor接口，给出具体实现。
 *
 * 定义：
 *     将抽象部分与它的实现部分分离，使他们都可以独立地变化。
 *
 * 适用场景：
 *     1. 如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，
 *        通过桥接模式可以使它们在抽象层建立一个关联关系；
 *     2. 对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用；
 *     3. 一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
 *
 * 优点：
 *     1. 抽象和实现的分离；
 *     2. 优秀的扩展能力；
 *     3. 实现细节对客户透明。
 * 缺点：
 *     桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。
 *
 */
public class Demo {
    public static void main(String[] args) {

        Computer computer = new Laptop(new MacOS()); // 来一个苹果笔记本。
        computer.powerOn();
        computer.run();
        computer.powerOff();
        System.out.println();
        computer = new Desktop(); // 组装了一台台式机。
        computer.setOs(new WindowOS()); // 给台式机装一个windows系统。
        computer.powerOn();
        computer.run();
        computer.powerOff();
        System.out.println();
        computer.setOs(new LinuxOS()); // windows系统用的不爽，换了一个linux系统。
        computer.powerOn();
        computer.run();
        computer.powerOff();
    }
}
