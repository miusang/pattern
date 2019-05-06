package cn.ning.pattern.structural.decorator;

/**
 * 阐教，具体装饰类。
 */
public class ChanJiao extends School {
    private Master teacher_name;
    enum Master {
        元始天尊,
        太乙真人,
        玉鼎真人
    }

    public ChanJiao(Person person) {
        super(person);
    }

    public ChanJiao(Person student, Master teacher_name) {
        super(student);
        this.teacher_name = teacher_name;
    }

    @Override
    public void skill() {
        super.skill();
        teachSkill();
    }

    @Override
    void teachSkill() {
        switch (teacher_name) {
            case 元始天尊:
                System.out.println("学习了大神通，如偷天换日等。");
                break;
            case 太乙真人:
                System.out.println("获得了法宝，如乾坤圈等。");
                break;
            case 玉鼎真人:
                System.out.println("学习高级法术，如七十二变等。");
                break;
            default:
                break;
        }
    }
}
