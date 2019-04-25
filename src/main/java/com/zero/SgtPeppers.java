package com.zero;

import org.springframework.stereotype.Component;

/**
 * <br>
 * 〈功能详细描述〉
 * com.zero
 *
 * @author 17112411 2018/11/27 20:34
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt Pepper's"; 
    private String arTist = "The CFN";

    @Override
    public void play() {
        System.out.println("Playing" + title + "by".concat(arTist));
    }
}
