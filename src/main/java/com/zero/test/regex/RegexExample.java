package com.zero.test.regex;

import java.util.regex.Pattern;

/**
 * com.zero.test.regex
 * 正则表达式--密码验证
 *
 * @author caofengnian
 * @Date 2019-10-28
 */
public class RegexExample {
    public static void main(String[] args) {
        int cnt = 0;
        boolean isMatch2 = Pattern.matches("^(?=.*[~!@#$%^&*()_+`\\-={}:\";'<>?,.\\/]).{6,20}$", "11");
        boolean isMatch1 = Pattern.matches("^^(?=.*[a-zA-Z]).{6,20}$", "11");
        boolean isMatch3 = Pattern.matches("^(?=.*\\d).{6,20}$", "11");
        if (isMatch1) {
            ++cnt;
        }
        if (isMatch2) {
            ++cnt;
        }
        if (isMatch3) {
            ++cnt;
        }

        System.out.println(cnt);
    }
}