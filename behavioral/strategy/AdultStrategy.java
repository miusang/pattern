package cn.ning.pattern.behavioral.strategy;

public class AdultStrategy implements Strategy {
    @Override
    public int getPrice(int price) {
        System.out.println("成人需支付票全额价：" + price);
        return price;
    }
}
