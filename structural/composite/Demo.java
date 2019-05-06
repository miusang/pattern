package cn.ning.pattern.structural.composite;

/*
 * 组合模式。
 *     |--- Component : 抽象构件角色
 *     |    定义了叶子和容器的共同点。
 *     |
 *     |--- Leaf : 叶子构件角色
 *     |    无子结点。
 *     |
 *     |--- Composite : 容器构件角色
 *     |    有容器特征，可以包含子结点。
 *
 * 定义：
 *     组合模式，又叫部分整体模式，是用于把一组相似的对象当做一个单一的对象。组合模式依据树形结构来组合对象，
 *     用来表示部分以及整体层次。
 *
 * 适用场景：
 *     部分、整体场景，如树形菜单，文件、文件夹的管理。
 *
 * 优点：
 *     1. 高层模块调用简单；
 *     2. 结点自由增加。
 * 缺点：
 *     在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。
 *
 */
public class Demo {
    public static void main(String[] args) {
        File home = new Folder("home");
        File text = new TextFile("README.md");
        File projects = new Folder("projects");
        File image = new ImageFile("desk.png");
        File text2 = new TextFile("a.txt");
        home.add(text);
        home.add(projects);
        projects.add(image);
        projects.add(text2);
        home.print();
    }
}
