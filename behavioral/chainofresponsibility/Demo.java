package cn.ning.pattern.behavioral.chainofresponsibility;

/*
 * 责任链模式。
 *     |--- Handler : 抽象处理者角色
 *     |    定义了处理请求的接口或者抽象类，提供了处理请求的方法和设置下一个处理者的方法。
 *     |
 *     |--- ConcreteHandler : 具体处理者角色
 *     |    实现或者继承抽象者角色，具体逻辑根据实际的架构来定。
 *
 * 定义：
 *     创建多个对象，使这些对象形成一条链，并沿着这条连传递请求，直到链上的某一个对象角色处理次请求。
 *
 * 适用场景：
 *     1. 多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定；
 *     2. 在不明确指定接收者的情况下，向多个对象中的一个提交一个请求；
 *     3. 可动态指定一组对象处理请求。
 *
 * 优点：
 *     1. 降低耦合度，将请求的发送者和接收者解耦；
 *     2. 简化了对象，使得对象不需要知道链的结构；
 *     3. 增强给对象指派职责的灵活性，通过改变链内的成员或者调动他们的次序，允许动态地新增或者删除责任；
 *     4. 增加新的吹请求类很方便。
 * 缺点：
 *     1. 不能保证请求一定被接收；
 *     2. 系统性能将受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用；
 *     3. 可能不容易观察运行时的特征，有碍于除错。
 *
 */
public class Demo {
    public static void main(String[] args) {
        Leader a = new Director("张飞");
        Leader b = new Manager("刘备");
        a.setNextLeader(b);
        AskLeave c = new AskLeave("小兵甲", 2, "看病");
        AskLeave d = new AskLeave("小兵已", 7, "探亲");
        a.handleRequest(c);
        a.handleRequest(d);
    }


}
