package com.zero.designates.prototype;

/**
 * <br>
 * 〈功能详细描述〉
 * com.zero.test.prototype
 *
 * @author 17112411 2018/12/27 16:12
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
