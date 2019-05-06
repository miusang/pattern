package cn.ning.pattern.behavioral.chainofresponsibility;

/**
 * 请假，请求事件类。
 */
public class AskLeave {
    private String name; // 姓名。
    private int day; // 请假天数。
    private String reason; // 事由。

    public AskLeave(String name, int day, String reason) {
        this.name = name;
        this.day = day;
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
