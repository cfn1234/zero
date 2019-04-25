package com.zero.test.collections;


import java.time.Clock;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * <br>
 * 〈功能详细描述〉
 * test.collections
 * 排序
 *
 * @author 17112411 2018/11/1 10:15
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
       /* Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });*/
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });
        String a = "1";
        String c = a != null ? "111" : "121";
        System.out.println(c);
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();

        Instant instant = clock.instant();
        // legacy java.util.Date
        Date legacyDate = Date.from(instant);
    }


}
