package com.zero.designates.observed;

/**
 *观察者接口Observer
 *
 * @author caofengnian
 * @Date 2019-12-02
 */
public interface Observer {

    /**
     * 更新数据
     * @param completeProgress
     * @param updateProgress
     */
    void update(int completeProgress, int updateProgress);

}
