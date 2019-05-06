package cn.ning.pattern.behavioral.state;

public class Light {
    private State state;

    public Light(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
