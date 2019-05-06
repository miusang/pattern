package cn.ning.pattern.behavioral.mediator;

/*
 * 中介者模式。
 *     |--- Mediator : 抽象中介者
 *     |    定义了同事对象到中介者对象的接口。
 *     |
 *     |--- ConcreteMediator : 具体中介者
 *     |    实现抽象中介者中定义的方法。它需要知道所有具体同事类，并从具体同事接收消息，向具体同事对象发出命令。
 *     |
 *     |--- Colleague : 抽象同事类
 *     |    主要负责约束同事对象的类型，并实现一些具体同事类之间的公共功能。
 *     |
 *     |--- ConcreteColleague : 具体同事类
 *     |    每个具体同事类只知道自己的行为，而不了解其他同事类的情况，但它们却都认识中介者对象。
 *
 * 定义：
 *     用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，
 *     而且可以独立地改变他们之间的交互。中介者模式又称调停者模式。
 *
 * 适用场景：
 *     1. 系统中对象之间存在比较复杂的引用关系，导致它们之间的依赖关系结构混乱而且难以复用该对象；
 *     2. 想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类。
 *
 * 优点：
 *     1. 降低了类的复杂度，将一对多转化成了一对一；
 *     2. 各个类之间的解耦；
 *     3. 符合迪米特原则。
 * 缺点：
 *     中介者会庞大，变得复杂难以维护。
 *
 */
public class Demo {
    public static void main(String[] args) {
        Person xuxian = new Person("许仙", Person.MALE); // 许仙来了。
        ZhenAi zhenAi = new ZhenAi(); // 许仙看见了珍爱网。
        xuxian.setAgency(zhenAi); // 许仙走进珍爱网。
        xuxian.付钱(100000); // 许仙充值，并开通了会员。
        xuxian.相亲(); // 许仙相亲。
        Person baisuzhen = new Person("白素贞", Person.FEMALE); // 白素贞来了
        baisuzhen.setAgency(zhenAi);
        baisuzhen.付钱(100000);
        baisuzhen.相亲();

    }
}
