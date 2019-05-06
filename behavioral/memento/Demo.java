package cn.ning.pattern.behavioral.memento;

/*
 * 备忘录模式
 *     |--- Originator : 发起人
 *     |    记录当前时刻的内部状态，负责定义哪些属于备份范围的状态，负责创建和恢复备忘录数据。
 *     |
 *     |--- Memento : 备忘录
 *     |    用于存储Originator的内部状态，并且可以防止Originator以外的对象访问Memento。
 *     |
 *     |--- Caretaker : 负责人
 *     |    对备忘录进行管理，保存和提供备忘录，不能对备忘录的内容进行操作和访问。
 *
 * 定义：
 *     在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 *     这样就可以将该对象恢复到原先保存的状态。
 *
 * 适用场景：
 *     1. 需要保存/恢复数据的相关状态场景。
 *     2. 提供一个可回滚的操作。
 *
 * 优点：
 *     1. 给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态。
 *     2. 实现了信息的封装，使得用户不需要关心状态的保存细节。
 * 缺点：
 *     消耗资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。
 *
 */
public class Demo {
    public static void main(String[] args) {
        OperatingSystem os = new OperatingSystem();
        os.setData("Win10系统");
        System.out.println(os.getData());
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(os.backup());
        os.setData("linux系统");
        System.out.println(os.getData());
        os.recovery(careTaker.getMemento());
        System.out.println(os.getData());

    }
}
