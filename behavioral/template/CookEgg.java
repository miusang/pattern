package cn.ning.pattern.behavioral.template;

public class CookEgg extends Cook {
    @Override
    void putVegetables() {
        System.out.println("第三步，放入鸡蛋；");
    }

    @Override
    void putCondiment() {
        System.out.println("第四步，依次加入食盐和青椒；");
    }
}
