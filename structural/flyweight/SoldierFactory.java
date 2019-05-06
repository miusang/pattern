package cn.ning.pattern.structural.flyweight;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 享元工厂类。
 */
public class SoldierFactory {
    private static Map<Integer, Soldier> map = new HashMap<>();
    public static Soldier getSoldier(int level) {
        if (map.get(level) != null) {
            return map.get(level);
        } else {
            Soldier soldier = new Bing(level);
            map.put(level, soldier);
            return soldier;
        }
    }
}
