package com.zero.test.io;

import java.io.*;

/**
 * <br>
 * 〈功能详细描述〉---读写入缓存
 * test.file
 *
 * @author 17112411 2018/9/4 11:36
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ReadWriteToFile {
    public static void main(String args[]) throws IOException {
        InputStreamReader sin = new InputStreamReader(System.in);
        //将输入流写入缓冲中
        BufferedReader bin = new BufferedReader(sin);
        FileWriter out = new FileWriter("myfile.txt");
        BufferedWriter bout = new BufferedWriter(out);
        String s;
        while ((s = bin.readLine()).length() > 0) {
            bout.write(s, 0, s.length());
        }
        bout.close();
    }

}
