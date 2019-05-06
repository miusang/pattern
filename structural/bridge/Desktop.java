package cn.ning.pattern.structural.bridge;

/**
 * 台式机，扩充抽象类。
 */
public class Desktop extends Computer {
    public Desktop(OperatingSystem os) {
        super(os);
    }
    public Desktop(){}
    @Override
    public void run() {
        System.out.println("台式机运行情况：");
        os.run();
    }
}
