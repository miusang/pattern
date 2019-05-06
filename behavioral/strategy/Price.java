package cn.ning.pattern.behavioral.strategy;

public class Price {
    private Strategy strategy;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getPrice(int price) {
        return strategy.getPrice(price);
    }
}
