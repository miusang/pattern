package cn.ning.pattern.creational.factory.abstractfactory;

/**
 * 普通座椅。
 */
public class CheapSeat implements Seat {
    @Override
    public void feel() {
        System.out.println("普通座椅。");
    }
}
