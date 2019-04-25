package com.zero.test.java11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * <br>
 * 〈功能详细描述〉
 * PACKAGE_NAME
 *
 * @author 17112411 2018/10/30 14:50
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class testJava11 {
    public static void main(String[] args) {
        try {
            var url = new URL("http://www.oracle.com/");
            var conn = url.openConnection();
            var reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
        }catch (Exception e){

        }
    }
}
