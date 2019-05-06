package cn.ning.pattern.behavioral.observer;

public class NewsUser implements Observer {
    private String name;

    public NewsUser(String name) {
        this.name = name;
    }

    @Override
    public void acceptMessage(String message) {
        System.out.println(name + "收到消息：" + message);
    }
}
