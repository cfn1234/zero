package com.zero.designates.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <br>
 * 〈功能详细描述〉CGLIB代理类
 * com.zero.test.designpatterns.proxy
 *
 * @author 17112411 2018/12/28 14:08
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;
    /**
     * 创建代理对象方法
     *
     * @param target        代理对象
     * @param args          对应的构造器参数类型
     *
     *                          例：有构造器如下
     *                          public Person(name,age){...} name为String.class age为int.class
     *                          写入name的类型与age的类型
     *
     *                          则：new Class[]{String.class,int.class}
     *
     * @param argsValue     对应的构造器参数值
     *
     *                          例:如此创建对象 new Person("name",23) 用以下方式传入：new Object[]{"name",23}
     *
     * @param <T>           <泛型方法>
     * @return              返回跟代理对象类型
     */
    public <T> T getInstance(T target,Class[] args,Object[] argsValue){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return (T) enhancer.create(args,argsValue);
    }

    /**
     * 创建代理对象方法
     *
     * @param target        代理对象
     * @param <T>           <泛型方法>
     * @return              返回跟代理对象类型
     */
    public <T> T getInstance(T target){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        try{
            System.out.println("Before "+method.getName()+" ..");
            result = methodProxy.invokeSuper(o,objects);
            System.out.println("End "+method.getName()+" ..");
        }catch(Exception e){
            System.out.println("Errod "+method.getName()+" ..");
        }
        return result;
    }
}
