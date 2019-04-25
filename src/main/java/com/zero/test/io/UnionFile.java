package com.zero.test.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * <br>
 * 〈功能详细描述〉Java实现分段视频合并
 * test.file
 *
 * @author 17112411 2018/12/20 15:19
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class UnionFile {

    public static void union(String dirPath, String toFilePath) {
        File dir = new File(dirPath);
        if (!dir.exists())
            return;
        File videoPartArr[] = dir.listFiles();
        if (videoPartArr.length == 0)
            return;
        File combineFile = new File(toFilePath);
        try (FileOutputStream writer = new FileOutputStream(combineFile)) {
            byte buffer[] = new byte[1024];
            for (File part : videoPartArr) {
                try (FileInputStream reader = new FileInputStream(part)) {
                    while (reader.read(buffer) != -1) {
                        writer.write(buffer);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
