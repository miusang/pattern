package cn.ning.pattern.creational.factory.abstractfactory;

/**
 * 高级发动机。
 */
public class PowerfulEngine implements Engine {
    @Override
    public void power() {
        System.out.println("动力强大的发动机。");
    }
}
