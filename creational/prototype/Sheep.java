package cn.ning.pattern.creational.prototype;

import java.util.Date;

/**
 * 原型类。
 */
public class Sheep implements Cloneable {
    private String name;
    private Date birthday;

    public Sheep(){}
    public Sheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        Sheep obj = (Sheep) super.clone();
        Date date = (Date) this.birthday.clone();
        obj.birthday = date; // 深拷贝
        return obj;
    }
}
