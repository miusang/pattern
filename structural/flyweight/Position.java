package cn.ning.pattern.structural.flyweight;

/**
 * 位置，非共享具体享元类。
 */
public class Position {
    private int x, y;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
