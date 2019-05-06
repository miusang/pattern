package cn.ning.pattern.structural.flyweight;

/**
 * 兵，具体享元类。
 */
public class Bing implements Soldier {
    private int level;
    public Bing(int level) {
        this.level = level;
    }
    @Override
    public void display(Position position) {
        String way;
        String kind;
        if (position.getX() == 0) {
            way = "上路";
        } else if (position.getX() == 1) {
            way = "中路";
        } else {
            way = "下路";
        }
        if (level == 0) {
            kind = "小兵";
        } else if (level == 1) {
            kind = "炮车";
        } else {
            kind = "超级兵";
        }
        System.out.println(kind + "在" + way + position.getY() + "处。");
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }
}
