package cn.ning.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹，容器构建角色。
 */
public class Folder implements File {
    private String name;
    private List<File> list = new ArrayList<>();
    public int level = 1;
    public Folder(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        String prefix = "";
        for (int i = 0; i < level; i++) {
            prefix += "|\t";
        }
        System.out.println(this.name + "---folder");
        for (File file : list) {
            if (file instanceof Folder) {
                ((Folder) file).level = this.level + 1;
            }
            System.out.print(prefix);
            file.print();
        }
    }

    @Override
    public boolean remove(File file) {
        return list.remove(file);
    }

    @Override
    public boolean add(File file) {
        return list.add(file);
    }
}
