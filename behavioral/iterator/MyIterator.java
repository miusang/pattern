package cn.ning.pattern.behavioral.iterator;

/**
 * 自定义迭代器接口。
 */
public interface MyIterator {
    void first();
    void next();
    boolean hasNext();
    boolean isFirst();
    boolean isLast();
    Object current();
}
