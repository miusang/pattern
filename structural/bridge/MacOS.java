package cn.ning.pattern.structural.bridge;

/**
 * MacOS系统，具体实现类。
 */
public class MacOS implements OperatingSystem {
    @Override
    public void run() {
        System.out.println("MacOS系统正在运行...");
    }
}
