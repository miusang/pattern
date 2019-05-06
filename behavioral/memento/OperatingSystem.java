package cn.ning.pattern.behavioral.memento;

/**
 * 发起人。
 */
public class OperatingSystem {
    private String data;
    public Memento backup() {
        return new Memento(this);
    }
    public void recovery(Memento memento) {
        data = memento.getData();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
