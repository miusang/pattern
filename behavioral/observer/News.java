package cn.ning.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class News implements Subject {
    private String name;
    private List<Observer> observers = new ArrayList<>();

    public News(String name) {
        this.name = name;
    }
    public void add(Observer observer) {
        observers.add(observer);

    }
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void publish(String message) {
        System.out.println(name + "发布新闻：" + message);
        for(Observer observer : observers) {
            observer.acceptMessage(message);
        }
    }
}
