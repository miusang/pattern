package cn.ning.pattern.behavioral.state;

public class GreenState implements State {
    @Override
    public void handle() {
        System.out.println("绿灯，可以通过。");
    }
}
