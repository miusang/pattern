package cn.ning.pattern.creational.factory.abstractfactory;

/**
 * 普通发动机。
 */
public class NormalEngine implements Engine {
    @Override
    public void power() {
        System.out.println("动力一般的发动机。");
    }
}
