package cn.ning.pattern.behavioral.template;

public class CookPotato extends Cook {
    @Override
    void putVegetables() {
        System.out.println("第三步，放入土豆丝；");
    }

    @Override
    void putCondiment() {
        System.out.println("第四步，依次加入食盐和醋；");
    }
}
