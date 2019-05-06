package cn.ning.pattern.structural.bridge;

/**
 * 笔记本，扩充抽象类。
 */
public class Laptop extends Computer {
    @Override
    public void run() {
        System.out.println("笔记本电脑运行情况:");
        os.run();
    }

    public Laptop(OperatingSystem os) {
        super(os);
    }
    public Laptop(){}
}
