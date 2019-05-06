package cn.ning.pattern.structural.adapter;

/*
 * 适配器模式。
 *     |--- Target : 目标抽象类
 *     |--- Adapter : 适配器类
 *     |--- Adaptee : 适配者类
 *     |--- Demo : 客户类
 *
 * 定义：
 *     将一个接口转换成客户希望的另一个接口，适配器模式使接口不兼容的类可以一起工作，其别名为包装器(Wrapper)。
 *
 * 适用场景：
 *     有动机地修改一个正常运行的系统的接口，这时应该考虑使用适配器模式。
 *
 * 优点：
 *     1. 可以让任何两个没有关联的类一起运行；
 *     2. 提高了类的复用；
 *     3. 增加了类的透明度；
 *     4. 灵活性好。
 * 缺点：
 *     1. 过多地使用适配器，会让系统非常零乱，不易整体进行把握。比如，明明看到调用的是A接口，其实内部被适配成了B接口
 *        的实现，一个系统如果太多出现这种情况，无异于一场灾难。因此如果不是很有必要，可以不使用适配器，而是直接对系
 *        统进行重构。
 *     2. 由于JAVA至多继承一个类，所以至多只能适配一个适配者类，而且目标类必须是抽象类。
 *
 */
public class Demo {

    public static void main(String[] args) {
        IPhoneX phone = new IPhoneX(); // 创建一部IphoneX手机。
        //将IPhoneX手机通过，Lightning转3.5mm耳机转接头，连接3.5mm耳机。
        phone.setAudioPlayer(new LightningToEarphone()) ;
        phone.playMusic(); // IPhoneX播放音乐。
    }
}
