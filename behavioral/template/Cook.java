package cn.ning.pattern.behavioral.template;

public abstract class Cook {
    public void make() {
        putOil();
        heatOil();
        putVegetables();
        putCondiment();
        done();
    }
    private void putOil() {
        System.out.println("第一步，倒油；");
    }
    private void heatOil() {
        System.out.println("第二步，热油；");
    }
    abstract void putVegetables();
    abstract void putCondiment();
    private void done() {
        System.out.println("炒一会，炒熟了。");
    }

}
