package cn.ning.pattern.behavioral.command;

/**
 * 开火命令，具体命令类。
 */
public class Fire implements Command{

    private Tank tank;

    public Fire(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void execute() {
        tank.shoot();
    }
}
