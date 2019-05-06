package cn.ning.pattern.structural.proxy;

/**
 * 游客，抽象主题角色。
 */
public interface Tourist {
    void makeSchedule(); // 制定行程。
    void buyTicket(); // 买票。
    void visit(); // 参观。
}
