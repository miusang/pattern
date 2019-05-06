package cn.ning.pattern.behavioral.state;

public class RedState implements State {
    @Override
    public void handle() {
        System.out.println("红灯，停止通过。");
    }
}
