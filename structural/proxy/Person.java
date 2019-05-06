package cn.ning.pattern.structural.proxy;

/**
 * 人，真实主题角色。
 */
public class Person implements Tourist {
    private String name;
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void visit() {
        System.out.println(name + "参观景点。");
    }

    @Override
    public void buyTicket() {
        System.out.println("到了景点，" + name + "要买票。");
    }

    @Override
    public void makeSchedule() {
        System.out.println("旅行前，" + name + "要制定行程。");
    }
}
