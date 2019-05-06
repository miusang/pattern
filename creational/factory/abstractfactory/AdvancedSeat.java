package cn.ning.pattern.creational.factory.abstractfactory;

/**
 * 高级座椅。
 */
public class AdvancedSeat implements Seat {
    @Override
    public void feel() {
        System.out.println("舒适座椅。");
    }
}
