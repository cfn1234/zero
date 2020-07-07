package com.zero.designates.observed;

/**
 * com.zero.designates.observed
 *
 * @author caofengnian
 * @Date 2019-12-02
 */
public class RunTest {
    
    public static void main(String[] args) {
        DevelopmentProgressData developmentProgressData = new DevelopmentProgressData();
        ProductManagerObserver productManagerObserver = new ProductManagerObserver(developmentProgressData);
        ProjectManagerObserver projectManagerObserver = new ProjectManagerObserver(developmentProgressData);
        developmentProgressData.setCurrentData(34, 45);
        //当项目经理出差了，不观察项目进度了就取消订阅了
        developmentProgressData.unRegisterObserver(projectManagerObserver);
        //当前只有产品经理获取到数据
        developmentProgressData.setCurrentData(46, 90);
    }
}