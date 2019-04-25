package com.zero.test.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * <br>
 * 〈功能详细描述〉
 * com.zero.test.io
 *
 * @author 17112411 2018/12/29 17:17
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class BufferedReaderTest {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\storm.txt"));
            do {

                System.out.println(br.readLine());
            } while (br.read() != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
