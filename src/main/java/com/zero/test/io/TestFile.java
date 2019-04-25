package com.zero.test.io;

import java.io.File;
import java.io.IOException;

/**
 * <br>
 * 〈功能详细描述〉
 * test.file
 *
 * @author 17112411 2018/8/27 16:12
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TestFile {
    /**
     * 方法实现说明
     * @method main
     * @author 17112411
     * @version
     * @param args
     * @return void
     * @exception
     * @date 2018/8/27 2018/8/27
     */
    public static void main(String args[]) throws IOException {
       /* try {
            //读取文件
            FileInputStream rf = new FileInputStream("d:/sprak.txt");
            int n = 512;
            byte buffer[] = new byte[n];
            while ((rf.read(buffer, 0, n) != -1) && (n > 0)) {
                System.out.println(new String(buffer));
            }
            System.out.println();
            rf.close();
        } catch (IOException IOe) {
            System.out.println(IOe.toString());
        }*/
       /* try {
            System.out.println("please Input from      Keyboard");
            int count, n = 512;
            byte buffer[] = new byte[n];
            count = System.in.read(buffer);
            FileOutputStream wf = new FileOutputStream("D:/myjava/write.txt");
            wf.write(buffer, 0, count);
            wf.close(); // 当流写操作结束时，调用close方法关闭流。
            System.out.println("Save to the write.txt");
        } catch (IOException IOe) {
            System.out.println("File Write Error!");
        }*/
        File dir = new File("D:\\root");
        File f1 = new File(dir, "fileOne.txt");
        File f2 = new File(dir, "fileTwo.java");
        // 文件对象创建后，指定的文件或目录不一定物理上存在
        if (!dir.exists())
            dir.mkdir();
        if (!f1.exists())
            f1.createNewFile();
        if (!f2.exists())
            f2.createNewFile();
        System.out.println("f1's AbsolutePath=  " + f1.getAbsolutePath());
        System.out.println("f1 Canread=" + f1.canRead());
        System.out.println("f1's len= " + f1.length());
        String[] FL;
        int count = 0;
        FL = dir.list();
        for (int i = 0; i < FL.length; i++) {
            count++;
            System.out.println(FL[i] + "is in \\root");
        }
        System.out.println("there are" + count + "file in //root");
    }

}
