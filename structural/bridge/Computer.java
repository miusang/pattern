package cn.ning.pattern.structural.bridge;

/**
 * 计算机，抽象类。
 */
public abstract class Computer {
    OperatingSystem os;
    public void setOs(OperatingSystem os) {
        this.os = os;
    }

    public Computer(OperatingSystem os) {
        this.os = os;
    }
    public Computer(){}
    public void powerOn() {
        System.out.println("正在开机...");
    }
    public abstract void run(); // 运行。
    void powerOff() {
        System.out.println("正在关机...");
    }
}