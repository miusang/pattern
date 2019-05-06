package cn.ning.pattern.structural.facade;

public class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void drink(Water water) {
        System.out.println(name + "喝了" + water);
    }
}
