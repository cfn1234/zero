package com.zero;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <br>
 * 〈功能详细描述〉
 * com.zero
 *
 * @author 17112411 2018/11/27 20:39
 * @see [相关类/方法]（可选）1
 * @since [产品/模块版本] （可选）
 */
@ComponentScan
public class CdPlayerConfig {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/applicationContext.xml");

    }
}
