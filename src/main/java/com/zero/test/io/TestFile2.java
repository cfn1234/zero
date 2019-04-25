package com.zero.test.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * <br>
 * 〈功能详细描述〉
 * test.file
 *
 * @author 17112411 2018/9/4 9:31
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TestFile2 {
    public static void main(String[] args) {
        String curDir = System.getProperty("user.dir");
        String classPath = Class.class.getClass().getResource("/").getPath();
        String classPath2  = Thread.currentThread().getContextClassLoader().getResource("test/io/").getPath();
        System.out.println("你当前的工作目录为 :" + classPath2);
        try {
            FileInputStream rf = new FileInputStream(classPath2+"TestFile.class");
            int n = 512;
            byte buffer[] = new byte[n];
            while ((rf.read(buffer, 0, n) != -1) && (n > 0)) {
                System.out.println(new String(buffer));
            }
            System.out.println("结束");
            rf.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
