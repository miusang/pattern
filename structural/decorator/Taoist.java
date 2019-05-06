package cn.ning.pattern.structural.decorator;

/**
 * 修士，具体构件。
 */
public class Taoist implements Person {
    private String name;
    public Taoist(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void skill() {
        System.out.println(name + "是一个修士，技能有：");
        System.out.println("吐纳、打坐等基本功。");
    }
}
