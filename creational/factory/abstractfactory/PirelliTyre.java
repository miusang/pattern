package cn.ning.pattern.creational.factory.abstractfactory;

/**
 * 普通轮胎。
 */
public class PirelliTyre implements Tyre {
    @Override
    public void instructions() {
        System.out.println("轮胎型号：倍耐力xxx1.0。");
    }
}
