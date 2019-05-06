package cn.ning.pattern.behavioral.chainofresponsibility;

/**
 * 经理，具体处理者角色。
 */
public class Manager extends Leader {
    @Override
    public void handleRequest(AskLeave askLeave) {
        if (askLeave.getDay() <= 7) {
            System.out.println("员工： " + askLeave.getName() + "， 请假天数： " +
                    askLeave.getDay() + "， 事由： " + askLeave.getReason());
            System.out.println("经理： " + this.getName() + "审批并通过。");
        } else {
            if (getNextLeader() != null) {
                getNextLeader().handleRequest(askLeave);
            }
        }
    }

    public Manager(String name) {
        super(name);
    }
}
