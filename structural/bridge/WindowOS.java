package cn.ning.pattern.structural.bridge;

/**
 * Windows系统，具体实现类
 */
public class WindowOS implements OperatingSystem {
    @Override
    public void run() {
        System.out.println("windows系统正在运行");
    }
}
