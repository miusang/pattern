package cn.ning.pattern.behavioral.strategy;

public class StudentStrategy implements Strategy {
    @Override
    public int getPrice(int price) {

        System.out.println("学生享受五折优惠：" + price/2);
        return price/2;
    }
}
