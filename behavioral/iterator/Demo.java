package cn.ning.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/*
 * 迭代器模式。
 *     |--- Iterator : 迭代器角色
 *     |    负责定义访问和遍历元素的接口。如，first()方法，next()等方法。
 *     |
 *     |--- ConcreteIterator : 具体迭代器角色
 *     |    实现迭代器接口中定义的方法，并要记录遍历中的当前位置。
 *     |
 *     |--- Container : 抽象容器角色
 *     |    负责提供创建迭代器对象的接口，即提供一个iterator()方法。
 *     |    如java中的Collection接口，List接口，Set接口等。
 *     |
 *     |--- ConcreteContainer : 具体容器角色
 *     |    抽象容器的具体实现类。如List接口的有序列表实现ArrayList，Set接口的哈希列表的实现HashSet等。
 *
 * 定义：
 *     提供一种方法访问一个容器对象中各个元素，而又不暴露该对象的内部细节。
 *
 * 适用场景：
 *     1. 访问一个聚合对象的内容而无须暴露它的内部表示；
 *     2. 需要为聚合对象提供多种遍历方式；
 *     3. 为遍历不同的聚合结构提供一个统一的接口。
 *
 * 优点：
 *     1. 它支持以不同的方式遍历一个聚合对象。
 *     2. 迭代器简化了聚合类。
 *     3. 在同一个聚合上可以有多个遍历。
 *     4. 在迭代器模式中，增加新的聚合类和迭代器类都很方便，无须修改原有代码。
 * 缺点：
 *     由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，
 *     这在一定程度上增加了系统的复杂性。
 *
 */
public class Demo {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add("1");
        list.add("2");
        list.add(new ArrayList());
        MyIterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.current());
            iter.next();
        }
    }
}
