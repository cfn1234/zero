package com.zero.test.io;

import java.io.File;
import java.io.FileReader;

/**
 * <br>
 * 〈功能详细描述〉----fileReader 读文件
 * com.zero.test.io
 *
 * @author 17112411 2018/12/29 16:08
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ReaderTest {
	public static void main(String[] args) {
		try {
			File file = new File("D:\\storm.txt");
			FileReader reader = new FileReader(file);
			char[] chars = new char[1];
			while (reader.read(chars) != -1) {
				System.out.println(chars);
			}
		} catch (Exception e) {
		}
	}
}
