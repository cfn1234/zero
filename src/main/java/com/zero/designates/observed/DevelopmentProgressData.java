package com.zero.designates.observed;

import java.util.ArrayList;

/**
 * com.zero.designates.observed
 *
 * @author caofengnian
 * @Date 2019-12-02
 */
public class DevelopmentProgressData implements Subject {

    private ArrayList arrayObserve;

    /**
     * 完成进度
     */
    private int completeProgress;
    /**
     * 更新进度
     */
    private int updateProgress;

    public DevelopmentProgressData() {
        arrayObserve = new ArrayList();
    }

    /**
     * 注册观察者
     *
     * @param observe
     */
    @Override
    public void registerObserver(Observer observe) {
        //将观察者添加到列表中
        arrayObserve.add(observe);
    }

    /**
     * 解除绑定观察者
     *
     * @param observe
     */
    @Override
    public void unRegisterObserver(Observer observe) {
        int i = arrayObserve.indexOf(observe);
        if (i >= 0) {
            //将观察者从列表中解除
            arrayObserve.remove(i);
        }
    }

    /**
     * 更新数据
     */
    @Override
    public void notifyObservers() {
        for (int i = 0; i < arrayObserve.size(); i++) {
            Observer o = (Observer) arrayObserve.get(i);
            o.update(completeProgress, updateProgress);
        }
    }

    public void setCurrentData(int completeProgress, int updateProgress) {
        this.completeProgress = completeProgress;
        this.updateProgress = updateProgress;
        notifyObservers();
    }
}