package cn.ning.pattern.structural.flyweight;

/**
 * 英雄联盟中的兵，抽象享元类。
 */
public interface Soldier {
    void setLevel(int level); // 设置级别，有小兵、炮车、超级兵。
    int getLevel();
    void display(Position position);
}