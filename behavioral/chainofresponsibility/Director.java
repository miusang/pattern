package cn.ning.pattern.behavioral.chainofresponsibility;

/**
 * 主管，具体处理者角色。
 */
public class Director extends Leader {
    @Override
    public void handleRequest(AskLeave askLeave) {
        if (askLeave.getDay() <= 3) {
            System.out.println("员工： " + askLeave.getName() + "， 请假天数： " +
                            askLeave.getDay() + "， 事由： " + askLeave.getReason());
            System.out.println("主管： " + this.getName() + "审批并通过。");
        } else {
            if (getNextLeader() != null) {
                getNextLeader().handleRequest(askLeave);
            }
        }
    }

    public Director(String name) {
        super(name);
    }
}
