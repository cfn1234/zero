package com.zero.genericity;

/**
 * 泛型接口
 *
 * @author caofengnian
 * @Date 2019-12-16
 */
public interface Generator<T> {

	/**
     * @return
     */
    T next();
    
}
