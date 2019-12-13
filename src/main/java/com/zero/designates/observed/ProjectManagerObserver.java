package com.zero.designates.observed;

/**
 * com.zero.designates.observed
 *
 * @author caofengnian
 * @Date 2019-12-02
 */
public class ProjectManagerObserver implements Observer, DisplaySchedule {
    /**
     * 完成进度
     */
    private int completeProgress;

    /**
     * 更新进度
     */
    private int updateProgress;
    /**
     * 将主题当成观察者的属性
     */
    private Subject developmentProgressSubject;

    public ProjectManagerObserver(Subject developmentProgressSubject) {
        this.developmentProgressSubject = developmentProgressSubject;
        //注册该观察者
        developmentProgressSubject.registerObserver(this);
    }

    /**
     *
     */
    @Override
    public void display() {
        System.out.println("项目经理管理者显示当前数据 完成进度为: " + completeProgress + "更新修改进度为:" + updateProgress);

    }

    /**
     * 更新数据
     *
     * @param completeProgress
     * @param updateProgress
     */
    @Override
    public void update(int completeProgress, int updateProgress) {
        this.completeProgress = completeProgress;
        this.updateProgress = updateProgress;
        display();
    }
}