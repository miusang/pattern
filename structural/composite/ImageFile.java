package cn.ning.pattern.structural.composite;

/**
 * 文本文件，叶子构件角色。
 */
public class ImageFile implements File {
    private String name;
    public ImageFile(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println(name + "---file");
    }

    @Override
    public boolean remove(File file) {
        System.out.println("Error:" + name + "是一个图片文件，不支持删除操作。");
        return false;
    }

    @Override
    public boolean add(File file) {
        System.out.println("Error:" + name + "是一个图片文件，不支持添加操作。");
        return false;
    }
}
