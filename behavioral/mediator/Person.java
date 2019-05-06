package cn.ning.pattern.behavioral.mediator;

public class Person {
    public static final boolean MALE = true;
    public static final boolean FEMALE = false;
    private String name;
    private boolean gender;
    private Agency agency;

    void 付钱(int money) {
        agency.收钱(this, money);
    }
    void 相亲() {
        Person p = agency.介绍对象(this);
        if (p != null) {
            System.out.println(name + "和" + p.getName() + "相亲。");
        }
        else {
            System.out.println("再等等，过一段时间让珍爱网介绍一个。");
        }

    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Person(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }
}
