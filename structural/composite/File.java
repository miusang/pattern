package cn.ning.pattern.structural.composite;

/**
 * 文件组件，构建构件角色。
 */
public interface File {
    boolean add(File file); // 添加。
    boolean remove(File file); // 删除。
    void print(); // 打印。
}
