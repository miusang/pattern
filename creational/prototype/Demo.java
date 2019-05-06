package cn.ning.pattern.creational.prototype;

import java.util.Date;

/*
 * 原型模式。
 *
 * 定义：
 *     用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象。可以使用序列化和反序列化技术和实现。
 *
 * 适用场景：
 *     1. 资源优化场景；
 *     2. 类初始化需要消耗非常多的资源，包括数据、硬件资源等；
 *     3. 性能和安全需求的场景；
 *     4. 通过new产生一个对象需要非常繁琐的数据准备和访问权限；
 *     5. 一个对象多个修改者的场景；
 *     6. 一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值的时候，可以考虑使用原型模式是拷贝多个对象，
 *        供调用者使用；
 *     7. 在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过 clone 的方法创建一个对象，
 *        然后由工厂方法提供给调用者。
 *
 * 优点：
 *     1. 提高性能；
 *     2. 避开构造函数的约束。
 * 缺点：
 *     1. 配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类不是很难，但对于已有的类不一定很容易，
 *        特别当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候。
 *     2. 必须实现Cloneable接口。
 *
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        Sheep dolly_mother = new Sheep("多利的母亲", new Date()); // 原型实例
        Thread.sleep(1000);
        Sheep dolly = dolly_mother.clone(); //新的实例。
        dolly.setName("多利");
        Date date = dolly.getBirthday();
        date.setTime(1929L);
        dolly.setBirthday(date);

        System.out.println(dolly_mother);
        System.out.println(dolly_mother.getName());
        System.out.println(dolly_mother.getBirthday());
        System.out.println(dolly==dolly_mother);
        System.out.println(dolly);
        System.out.println(dolly.getName());
        System.out.println(dolly.getBirthday());
    }
}
