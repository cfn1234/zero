package com.zero.test.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * <br>
 * 〈功能详细描述〉
 *
 * @author 17112411 on 2018/4/9.
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TreeSetIteratorTest {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add("aaa");
        set.add("aaa");
        set.add("bbb");
        set.add("eee");
        set.add("ddd");
        set.add("ccc");

        // 顺序遍历TreeSet
        ascIteratorThroughIterator(set) ;
        // 逆序遍历TreeSet
        descIteratorThroughIterator(set);
        // 通过for-each遍历TreeSet。不推荐！此方法需要先将Set转换为数组
        foreachTreeSet(set);
    }

    // 顺序遍历TreeSet
    public static void ascIteratorThroughIterator(TreeSet set) {
        System.out.print("\n ---- Ascend Iterator ----\n");
        for(Iterator iter = set.iterator(); iter.hasNext(); ) {
            System.out.printf("asc : %s\n", iter.next());
        }
    }

    // 逆序遍历TreeSet
    public static void descIteratorThroughIterator(TreeSet set) {
        System.out.printf("\n ---- Descend Iterator ----\n");
        for( Iterator iter= set.descendingIterator(); iter.hasNext(); ) {
            System.out.printf("desc : %s\n", (String)iter.next());
        }
    }

    // 通过for-each遍历TreeSet。不推荐！此方法需要先将Set转换为数组
    private static void foreachTreeSet(TreeSet set) {
        System.out.printf("\n ---- For-each ----\n");
        String[] arr = (String[])set.toArray(new String[0]);
        for (String str:arr)
            System.out.printf("for each : %s\n", str);
    }
}
