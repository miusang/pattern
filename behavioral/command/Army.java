package cn.ning.pattern.behavioral.command;

/**
 * 军队，调用者。
 */
public class Army {
    private Command command;

    public Army(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }
}
