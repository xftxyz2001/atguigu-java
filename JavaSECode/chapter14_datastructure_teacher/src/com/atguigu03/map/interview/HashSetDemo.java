package com.atguigu03.map.interview;

import java.util.HashSet;

/**
 * 说明：
 * key-value存储到HashMap中会存储key的hash值，这样就不用在每次查找时重新计算每一个Entry或
 * Node（TreeNode）的hash值了，因此如果已经put到Map中的key-value，再修改key的属性，而这个属性
 * 又参与hashcode值的计算，那么会导致匹配不上。
 *
 * 这个规则也同样适用于LinkedHashMap、HashSet、LinkedHashSet、Hashtable等所有散列存储结构的集合。
 *
 * 所以实际开发中，经常选用String，Integer等作为key，因为它们都是不可变对象。
 * @author shkstart
 * @create 15:35
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p1 = new Person(1001,"AA");
        Person p2 = new Person(1002,"BB");

        set.add(p1);
        set.add(p2);
        System.out.println(set);

        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);
//
        set.add(new Person(1001,"CC"));
        System.out.println(set);
//
        set.add(new Person(1001,"AA"));
        System.out.println(set);

    }
}
