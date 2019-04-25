package com.zero.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * <br>
 * 〈功能详细描述〉
 * com.zero.bean
 *
 * @author 17112411 2019/1/28 14:52
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Employee implements InitializingBean, DisposableBean, BeanNameAware {
    private String id;// 员工编号
    private String name;// 员工姓名
    private String sex;// 员工性别
    private String age;// 员工年龄
    private String nativePlace;// 员工籍贯
    private String department;// 员工部门
    private String beanName;// bean的名称

    public Employee() {
        System.out.println("**********第一步：调用Bean的默认构造方法**********");
        this.id = "bean1:G080405214";
        System.out.println("bean1的 值：" + this);
        System.out.println("**********第二步：检查Bean配置文件中是否注入了Bean的属性值**********");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bean2的值：" + this);
        System.out.println("**********第三步：检查Bean是否实现了InitializingBean接口**********");
        this.name = "bean3:李晓红";
        this.sex = "bean3:女";
        this.age = "bean3:25";
        System.out.println("bean3的值：" + this);
    }

    public void init() {
        System.out
                .println("**********第四步：检查Bean配置文件中是否指定了init-method此属性**********");
        this.nativePlace = "bean3:北京";
        System.out.println("bean4的值：" + this);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("**********服务停止**********");
    }

    @Override
    public void setBeanName(String arg0) {
        System.out.println("**********设置bean的名称**********");
        this.beanName = "myBeanName";

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBeanName() {
        return beanName;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", sex=" + sex
                + ", age=" + age + ", nativePlace=" + nativePlace
                + ", department=" + department + ", beanName=" + beanName + "]";
    }
}
