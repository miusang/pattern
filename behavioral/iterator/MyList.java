package cn.ning.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义聚合类。
 */
public class MyList {
    private List<Object> list = new ArrayList<>();

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public void add(Object obj) {
        this.list.add(obj);
    }

    public void remove(Object obj) {
        this.list.remove(obj);
    }


    public MyIterator iterator() {
        return new MyListIterator();
    }
    private class MyListIterator implements MyIterator {
        private int cursor; // 定义游标，用于记录遍历时的位置。
        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if (cursor < list.size()) {
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public boolean isLast() {
            return cursor == list.size() - 1;
        }

        @Override
        public Object current() {
            return list.get(cursor);
        }
    }
}
