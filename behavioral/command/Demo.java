package cn.ning.pattern.behavioral.command;

/**
 * 命令模式。
 *     |--- Command : 抽象命令类
 *     |    声明了一个给所有具体命令类的抽象接口。
 *     |
 *     |--- ConcreteCommand : 具体命令类
 *     |    定义一个接收者和行为之间的弱耦合；实现execute()方法，负责调用接收者的相应操作。
 *     |    execute()方法通常叫做执行方法。
 *     |
 *     |--- Invoker : 调用者
 *     |    负责调用命令对象执行请求，相关的方法叫做行动方法。
 *     |
 *     |--- Receiver : 接收者
 *     |    负责具体实施和执行一个请求。任何一个类都可以成为接收者，实施和执行请求的方法叫做行动方法。
 *     |
 *     |--- Client : 客户类
 *     |    创建一个具体命令对象并确定其接收者。
 *
 * 定义：
 *     将一个请求封装为一个对象，从而使我们可用不同的请求对客户进行参数化；对请求排队或者记录请求日志，
 *     以及支持可撤销的操作。其别名为动作(Action)模式或事务(Transaction)模式。
 *
 * 适用场景：
 *     认为是命令的地方都可以使用命令模式，比如：
 *     1. GUI 中每一个按钮都是一条命令；
 *     2. 模拟 CMD。
 *
 * 优点：
 *     1. 降低了系统耦合度；
 *     2. 新的命令可以很容易添加到系统中去。
 * 缺点：
 *     使用命令模式可能会导致某些系统有过多的具体命令类。
 *
 */
public class Demo {
    public static void main(String[] args) {
        Command command = new Fire(new Tank()); // 坦克射击命令。
        Army army = new Army(command); // 命令下达给军队。
        army.invoke(); // 军队执行命令。
    }
}
