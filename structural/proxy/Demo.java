package cn.ning.pattern.structural.proxy;

/*
 * 代理模式。
 *     |--- Subject : 抽象主题角色
 *     |--- Proxy : 代理主题角色
 *     |--- RealSubject : 真实主题角色
 *
 * 定义：
 *     给某一个对象提供一个代理，并由代理对象控制对原对象的引用。
 *
 * 适用场景：
 *     1. 远程代理；
 *     2. 虚拟代理；
 *     3. Copy-on-Write代理；
 *     4. 保护代理；
 *     5. Cache代理；
 *     6. 防火墙代理；
 *     7. 同步化代理；
 *     8. 智能引用代理。
 *
 * 优点：
 *     1. 职责清晰；
 *     2. 高扩展性；
 *     3. 智能化。
 * 缺点：
 *     1. 由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢。
 *     2. 实现代理模式需要额外的工作，有些代理模式的实现非常复杂。
 *
 */
public class Demo {
    public static void main(String[] args) {
        Person sanzang = new Person("唐三藏"); // 来了一位游客，叫唐三藏。
        Tourist agency = new TravelAgency(sanzang); // 唐三藏走进旅行社。
        /* 在旅行社的带领下，唐三藏开启了一段旅行。 */
        agency.makeSchedule();
        agency.buyTicket();
        agency.visit();
    }
}
