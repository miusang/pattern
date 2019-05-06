package cn.ning.pattern.behavioral.memento;

public class Memento {
    private String data;

    public Memento(OperatingSystem os) {
        this.data = os.getData();
    }

    public String getData() {
        return data;
    }

}
