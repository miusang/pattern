package cn.ning.pattern.behavioral.strategy;

import cn.ning.pattern.behavioral.mediator.Person;

/*
 * 策略模式。
 *     |--- Context : 环境类
 *     |    持有一个Strategy的引用。
 *     |
 *     |--- Strategy : 抽象策略类
 *     |    通常情况下为一个接口，当各个实现类中存在着重复的逻辑时，则使用抽象类来封装这部分公共的代码。
 *     |
 *     |--- ConcreteStrategy : 具体策略类
 *     |    通常由一组封装了算法的类来担任，这些类之间可以根据需要自由替换。
 *
 * 定义：
 *     定义一系列算法，将每一个算法封装起来，并让他们可以相互替换。
 *
 * 适用场景：
 *     1. 如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多行为中
 *        选择一种行为。
 *     2. 一个系统需要动态地在几种算法中选择一种。
 *     3. 如果一个对象有很多的行为，如果不用恰当的模式，这些行为就只好使用多重的条件选择语句来实现。
 *
 * 优点：
 *     1. 算法可以自由切换。
 *     2. 避免使用多重条件判断。
 *     3. 扩展性良好。
 * 缺点：
 *     1. 策略类会增多。
 *     2. 所有策略类都需要对外暴露。
 *
 */
public class Demo {
    public static void main(String[] args) {
        Strategy strategy = new AdultStrategy();
        Price price = new Price(strategy);
        price.getPrice(100);
        strategy = new StudentStrategy();
        price.setStrategy(strategy);
        price.getPrice(100);
        strategy = new ChildStrategy();
        price.setStrategy(strategy);
        price.getPrice(100);
    }


}
