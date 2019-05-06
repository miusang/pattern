package cn.ning.pattern.creational.factory.abstractfactory;

/**
 * 高级轮胎。
 */
public class MichelinTyre implements Tyre {
    @Override
    public void instructions() {
        System.out.println("轮胎型号：米其林xxx1.0。");
    }
}
