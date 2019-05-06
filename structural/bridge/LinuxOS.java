package cn.ning.pattern.structural.bridge;

/**
 * Linux系统，具体实现类。
 */
public class LinuxOS implements OperatingSystem {
    @Override
    public void run() {
        System.out.println("linux系统正在运行...");
    }
}
