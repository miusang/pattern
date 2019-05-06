package cn.ning.pattern.behavioral.chainofresponsibility;

/**
 * 领导，抽象处理者角色。
 */
public abstract class Leader {
    private String name;
    private Leader nextLeader; // 责任链后继对象。
    public Leader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Leader getNextLeader() {
        return nextLeader;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    /**
     * 处理请求。
     */
    public abstract void handleRequest(AskLeave askLeave);
}
