package cn.ning.pattern.structural.facade;

/**
 * 水，子系统。
 */
public class Water {
    private int temperature;
    private Tea tea;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setTea(Tea tea) {
       // System.out.println("往水中加入了" + tea.getName());
        this.tea = tea;
    }

    public String toString() {
        if (temperature >= 90) {
            if (tea != null) {
                return "一杯热的" + tea.getName();
            } else {
                return "一杯热水";
            }
        } else  if (temperature >= 30 && temperature < 90){
            if (tea != null) {
                return "一杯温的" + tea.getName();
            } else {
                return "一杯温水";
            }
        } else {
            if (tea != null) {
                return "一杯凉的" + tea.getName();
            } else {
                return "一杯凉水";
            }
        }
    }
}
