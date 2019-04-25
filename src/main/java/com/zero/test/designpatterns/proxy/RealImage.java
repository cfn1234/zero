package com.zero.test.designpatterns.proxy;

/**
 * <br>
 * 〈功能详细描述〉
 * com.zero.test.designpatterns.proxy
 *
 * @author 17112411 2018/12/28 9:34
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
