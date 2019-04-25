package com.zero.test.Default;

/**
 * <br>
 * 〈功能详细描述〉
 * test.Default
 *
 * @author 17112411 2018/8/6 11:34
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class DefaultImpl implements Default {
    @Override
    public void method() {
        System.out.println("method in Class");
    }

    public static void main(String[] args) {
        Default d = new DefaultImpl();
        d.method();
    }
}