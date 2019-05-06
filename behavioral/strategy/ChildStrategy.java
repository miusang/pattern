package cn.ning.pattern.behavioral.strategy;

public class ChildStrategy implements Strategy{
    @Override
    public int getPrice(int price) {
        System.out.println("儿童享受免费优惠政策。");
        return 0;
    }
}
