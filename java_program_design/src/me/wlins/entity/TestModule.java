package me.wlins.entity;

/**
 * @ClassName TestModule
 * @Description Define the TestModule object.
 * @Author strawberrylin
 * @Date 18-10-24 下午9:05
 * @Version 1.0
 **/
public class TestModule {
    private int id;             //测试模块id
    private String unitName;    //测试模块名
    private String testClass;   //测试模块加载类

    public TestModule(int id, String unitName, String testClass) {
        this.id = id;
        this.unitName = unitName;
        this.testClass = testClass;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setTestClass(String testClass) {
        this.testClass = testClass;
    }

    public int getId() {
        return id;
    }

    public String getUnitName() {
        return unitName;
    }

    public String getTestClass() {
        return testClass;
    }

    public String toString(){
        return "TestModule [id:" + id + ", unit-name:" + unitName + ", test-class:" + testClass + "]";
    }
}
