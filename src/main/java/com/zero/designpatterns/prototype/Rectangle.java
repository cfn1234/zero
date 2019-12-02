package com.zero.designpatterns.prototype;

/**
 * <br>
 * 〈功能详细描述〉
 * com.zero.test.prototype
 *
 * @author 17112411 2018/12/27 15:32
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
    public Rectangle(){
        type = "Rectangle";
    }
}
