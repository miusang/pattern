package cn.ning.pattern.structural.decorator;
/*
 * 装饰模式。
 *     |--- Component : 抽象构件
 *     |--- ConcreteComponent : 具体构件
 *     |--- Decorator : 抽象装饰类
 *     |--- ConcreteDecorator : 具体装饰类
 *
 * 定义：
 *     动态地给一个对象增加一些额外的职责，就增加对象功能来说，装饰模式比生成子类实现更为灵活。其别名也可以成为包装器，
 *     与适配器别名相同，但他们适用于不同的场合。
 *
 * 适用场景：
 *     1. 扩展一个类的功能；
 *     2. 动态增加功能，动态撤销。
 *
 * 优点：
 *     装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
 * 缺点：
 *     多层装饰比较复杂。
 *
 */
public class Demo {
    public static void main(String[] args) {

        Person jiangziya = new Taoist("姜子牙"); // 姜子牙出生了
        System.out.println("姜子牙刚出生后的技能：");
        jiangziya.skill(); //
        //姜子牙入阐教，拜元始天尊为师。
        School school = new ChanJiao(jiangziya, ChanJiao.Master.元始天尊);
        System.out.println("姜子牙入阐教，拜元始天尊为师后，掌握的技能：");
        school.skill();
        Person yangjian = new Taoist("杨戬");
        school = new ChanJiao(yangjian, ChanJiao.Master.玉鼎真人);
        school.skill();
        Person duobao = new Taoist("多宝道人");
        school = new JieJiao(duobao, JieJiao.Master.通天教主);
        school.skill();
    }
}
