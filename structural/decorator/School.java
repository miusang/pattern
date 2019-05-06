package cn.ning.pattern.structural.decorator;

/**
 * 宗门，抽象装饰类。
 */
public  abstract class School implements Person {

    private Person student; // 弟子。
    abstract void teachSkill(); // 教授技能。
    @Override
    public void skill() {
        student.skill();
    }
    public School(Person person) {
        this.student = person;
    }
}
