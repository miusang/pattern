package cn.ning.pattern.behavioral.observer;

/*
 * 观察者模式
 *     |--- Subject : 目标
 *     |--- ConcreteSubject : 具体目标
 *     |--- Observer : 观察者
 *     |--- ConcreteObserver : 具体观察者
 *
 * 定义：
 *     定义对象间的一种一对多依赖关系，使得每当一个对象状态发生改变时，其相互依赖对象皆得到通知并被自动更新。
 *
 * 适用场景：
 *     1. 一个抽象模型有两个方面，其中一个方面依赖于另一个方面。
 *        将这些方面封装在独立的对象中使它们可以各自独立地改变和复用。
 *     2. 一个对象的改变将导致其他一个或多个对象也发生改变，而不知道具体有多少对象将发生改变，
 *        可以降低对象之间的耦合度。
 *     3. 一个对象必须通知其他对象，而并不知道这些对象是谁。
 *     4. 需要在系统中创建一个触发链，A对象的行为将影响B对象，B对象的行为将影响C对象……，
 *        可以使用观察者模式创建一种链式触发机制。
 *
 * 优点：
 *     1. 观察者和被观察者是抽象耦合的。
 *     2. 建立一套触发机制。
 * 缺点：
 *     1. 如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。
 *     2. 如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。
 *     3. 观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。
 *
 */
public class Demo {
    public static void main(String[] args) {
        News xinhua = new News("新华社"); // 新华社成立了。
        NewsUser zhangsan = new NewsUser("张三");
        NewsUser lisi = new NewsUser("李四");
        NewsUser wangwu = new NewsUser("王五");
        xinhua.add(zhangsan); // 张三，李四，王五订阅了新华社。
        xinhua.add(lisi);
        xinhua.add(wangwu);
        xinhua.publish("高考要改革了。"); // 新华社发布新闻。
    }
}
