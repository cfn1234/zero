package com.zero.test.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <br>
 * 〈功能详细描述〉
 * com.zero.test.io
 *
 * @author 17112411 2018/12/29 16:56
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class fileWriter {
    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("D:\\storm.txt");
            writer = new FileWriter("D:\\testWriter.txt");
            char[] chars = new char[1];
            while (reader.read(chars)!=-1){
                System.out.println(chars);
                writer.write(chars);
            }
            writer.flush();
        } catch (Exception e) {

        }finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
