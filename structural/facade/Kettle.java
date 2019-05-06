package cn.ning.pattern.structural.facade;

public class Kettle {
    private Water water;

    public Kettle(Water water) {
        this.water = water;
    }

    public void heating(int temperature) {
        if (water != null) {
            water.setTemperature(temperature);
            // System.out.println("将水加热到" + temperature + "摄氏度");
        } else {
            System.out.println("水壶里没水");
        }
    }
}
