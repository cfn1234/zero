package com.zero.designpatterns.prototype;

/**
 * <br>
 * 〈功能详细描述〉
 * com.zero.test.prototype
 *
 * @author 17112411 2018/12/27 16:12
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
