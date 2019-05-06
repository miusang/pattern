package cn.ning.pattern.structural.decorator;

/**
 * 截教，具体装饰类。
 */
public class JieJiao extends School {
    private Master teacher_name;
    enum Master {
        通天教主,
//        多宝道人,
//        赵公明
    }
    @Override
    public void skill() {
        super.skill();
        teachSkill();
    }

    @Override
    void teachSkill() {
        switch (teacher_name) {
            case 通天教主:
                System.out.println("掌握了诛仙阵。");
                break;
//            case 多宝道人:
//                System.out.println("学习了高级法术。");
//                break;
//            case 赵公明:
//                System.out.println("获得了法宝定海珠。");
                default:
                    break;
        }
    }

    public JieJiao(Person person) {
        super(person);
    }
    public JieJiao(Person person, Master teacher_name) {
        super(person);
        this.teacher_name = teacher_name;
    }
}
