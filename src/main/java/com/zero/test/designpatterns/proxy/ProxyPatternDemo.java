package com.zero.test.designpatterns.proxy;

/**
 * <br>
 * 〈功能详细描述〉
 * com.zero.test.designpatterns.proxy
 *
 * @author 17112411 2018/12/28 9:42
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
