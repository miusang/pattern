package cn.ning.pattern.creational.singleton;

import java.io.ObjectStreamException;
import java.lang.reflect.Method;

/**
 * 单例模式。
 *
 * 作用：
 *     保证一个类只有一个实例，并且提供一个访问该实例的全局访问点。
 * 优点：
 *     1. 在内存里只有一个实例，减少了内存的开销，尤其是频繁的创建和销毁实例；
 *     2. 避免对资源的多重占用(比如写文件操作)。
 * 缺点：
 *     没有接口，不能继承，与单一职责原则相冲突。
 */
/*
 * 使用注意事项：
 *      不能使用反射和反序列化模式创建单例，否则会实例化一个新的对象。
 *
 * 常见应用场景：
 *      1. windows的Task Manager(任务管理器)就是单例模式；
 *      2. Windows的Recycle Bin(回收站)也是典型的单例应用，在整个系统的运行中，回收站一直维护着仅有的一个实例；
 *      3. 项目中的配置文件的类，一般也只有一个对象。没有必要每次使用配置文件数据时，每次new一个对象去读取；
 *      4. 网站的计数器，一般也是采用单例模式，否则难以同步；
 *      5. 应用程序的日志应用，一般也采用单例模式，这是由于共享的日志文件一直都处于打开状态，因为只有一个实例去操作，否
 *         则内容不好追加；
 *      6. 数据库连接池的设计一般也是采用单例模式，因为数据库连接是一种数据库资源。数据库软件系统中使用数据库连接池，主
 *         要是节省打开或者关闭数据库连接所引起的效率损耗；
 *      7. 操作系统的文件系统；
 *      8. 在Spring中，每个Bean默认就是单例的，这样做的优点是Spring容器可以管理；
 *      9. 在Servlet编程中，每个servlet也是单例；
 *      10. 在Spring MVC框架/structs1框架中，控制器对象也是单例。
 */
public class SingletonDemo implements Runnable {

    public static void main(String[] args) {
        String index = "1";
        SingletonDemo s = new SingletonDemo(index);
        while (true) {
            Object obj2 = obj;
            Thread t = new Thread(s);
            t.start();
            if (obj2 != null && obj != null && obj != obj2) {
                break;
            }
        }
        System.out.println("多线程创建了多个Singleton" + index + "实例。");
    }

    @Override
    public void run() {
        try {
            String class_name = "cn.ning.pattern.creational.singleton.Singleton".concat(this.index);
            Class<?> clazz = Class.forName(class_name);
            String method_name = "getInstance";
            Method getInstance = clazz.getMethod(method_name);
            SingletonDemo.obj = getInstance.invoke(null);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private static Object obj;
    private String index;

    SingletonDemo(String index) {
        this.index = index;
    }
}

/**
 * 懒汉式，非线程安全。
 *
 */
class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){} // 私有化构造器。
    public static Singleton1 getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(100); // 此处线程暂停，用于多线程测试。
            } catch (Exception e) {}
            instance = new Singleton1();
        }
        return instance;
    }
}

/**
 * 饿汉式，线程安全。通过类加载机制避免了多线程问题。
 * lazy loading : false.
 * 优点： 没有加锁，调用效率高。
 * 缺点： 类加载时就初始化，浪费内存。
 *
 */
class Singleton2 {
    private static Singleton2 instance = new Singleton2();
    private Singleton2(){}
    public static Singleton2 getInstance() {
        return instance;
    }
}

/**
 * 懒汉式，线程安全。
 * lazy loading : true.
 * 优点： 调用时才初始化，避免内存浪费。
 * 缺点： 调用函数加锁，调用效率低。
 */
class Singleton3 {
    private static Singleton3 instance;
    private Singleton3() {
        if (instance != null) { // 防止通过反射机制新建实例。
            throw new RuntimeException();
        }
    }
    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(100); // 此处线程暂停，用于多线程测试。
            } catch (Exception e) {}
            instance = new Singleton3();
        }
        return instance;
    }
    /**
     * 防止反序列化获取多个实例的漏洞。
     * 反序列化时，如果定义了readResolve()则直接返回此方法指定的对象。
     */
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}

/**
 * 双重检测锁式，线程安全。
 * lazy loading : true.
 * 优点： 调用效率高。
 * 缺点： 由于JVM底层内部模型原因，偶尔会出现失效问题，这是由于instance = new Singleton4()不是原子操作。在jdk1.5
 *       以后具体化了volatile关键字，来保证程序的正确性。但，volatile也会影响性能。
 */
class Singleton4 {
    private volatile static Singleton4 instance;
    private Singleton4(){}
    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(100); // 此处线程暂停，用于多线程测试。
                    } catch (Exception e) {}
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}

/**
 * 内部静态类式，线程安全。第一次加载Singleton5时不会被初始化，只有调用时，才会加载SingletonHolder类，从而完成单例
 * 的初始化。
 * lazy loading : true.
 * 优点： 调用效率高。
 */
class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5(); // 由于类加载机制，初始化只执行一次。
    }
    private Singleton5(){}
    public static Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

/**
 * 枚举式，线程安全。
 * lazy loading : false.
 * 优点： 调用效率高，自动支持序列化机制。
 */
enum Singleton6 {
    INSTANCE;
    public void yourMethod(){}
    public int a;
}