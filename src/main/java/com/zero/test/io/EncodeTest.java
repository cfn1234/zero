package com.zero.test.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * <br>
 * 〈功能详细描述〉
 * test.file
 * InputStream与Reader差别 OutputStream与Writer差别
 *
 * @author 17112411 2018/9/4 14:30
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class EncodeTest {
    private static void readBuff(byte[] buff) throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(buff);
        int data;
        while ((data = in.read()) != -1) System.out.print(data + "  ");
        System.out.println("11111");
        in.close();
    }

    public static void main(String args[]) throws IOException {
        System.out.println("内存中采用unicode字符编码：");
        char c = '好';
        int lowBit = c & 0xFF;
        int highBit = (c & 0xFF00) >> 8;
        System.out.println("" + lowBit + "   " + highBit);
        String s = "好";
        System.out.println("本地操作系统默认字符编码：");
        readBuff(s.getBytes());
        System.out.println("采用GBK字符编码：");
        readBuff(s.getBytes("GBK"));
        System.out.println("采用UTF-8字符编码：");
        readBuff(s.getBytes("UTF-8"));
    }

}
