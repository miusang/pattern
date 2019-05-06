package cn.ning.pattern.behavioral.mediator;

/**
 * 婚介中心，抽象中介者。
 */
public interface Agency {
    void 收钱(Person person, int money);
    Person 介绍对象(Person person);
}
