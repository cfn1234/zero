package com.zero.designates.proxy;

/**
 * <br>
 * 〈功能详细描述〉
 * com.zero.test.designpatterns.proxy
 *
 * @author 17112411 2018/12/28 9:41
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
