package com.zero.designates.observed;

/**
 * com.zero.designates.observed
 * 主题
 *
 * @author caofengnian
 * @Date 2019-12-02
 */
public interface Subject {
    /**
     * 注册观察者
     *
     * @param observe
     */
    //
    void registerObserver(Observer observe);

    /**
     * 解除绑定观察者
     *
     * @param observe
     */
    void unRegisterObserver(Observer observe);

    /**
     * 更新数据
     */
    void notifyObservers();
}