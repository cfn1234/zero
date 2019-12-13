package com.zero.designates.prototype;

/**
 * <br>
 * 〈功能详细描述〉
 * com.zero.test.prototype
 *
 * @author 17112411 2018/12/27 15:34
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
