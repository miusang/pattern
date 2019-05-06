package cn.ning.pattern.behavioral.template;

/*
 * 模板方法模式。
 *     |--- AbstractTemplate : 抽象模板角色
 *     |--- ConcreteTemplate : 具体模板角色
 *
 * 定义：
 *     一个抽象类公开定义了执行它的方法的方式或模板。它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。
 *
 * 适用场景：
 *     1. 有多个子类共有的方法，且逻辑相同。
 *     2. 重要的、复杂的方法，可以考虑作为模板方法。
 *
 * 优点：
 *     1. 封装不变部分，扩展可变部分。
 *     2. 提取公共代码，便于维护。
 *     3. 行为由父类控制，子类实现。
 * 缺点：
 *     每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大。
 *
 */
public class Demo {
    public static void main(String[] args) {
        Cook cook = new CookPotato();
        cook.make();
        System.out.println();
        cook = new CookEgg();
        cook.make();
    }
}
