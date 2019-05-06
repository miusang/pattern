package cn.ning.pattern.structural.facade;

/**
 * 茶楼，外观角色。
 */
public class TeaHouse {
    private String name;
    public TeaHouse (String name) {
        this.name = name;
    }
    public Water makeTea(String tea_name) {
        Tea tea = new Tea(tea_name);
        Water water = new Water();
        water.setTea(tea);
        Kettle kettle = new Kettle(water);
        kettle.heating(100);
        return water;

    }
}
