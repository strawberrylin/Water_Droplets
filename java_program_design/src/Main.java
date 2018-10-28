/**
 * @ClassName Main
 * @Description The Entrance of the program.
 * @Author strawberrylin
 * @Date 18-10-11 下午9:40
 * @Version 1.0
 **/

import me.wlins.entity.TestModule;
import me.wlins.util.TestModuleLoader;
import me.wlins.base.TestBase;

import java.util.Hashtable;

public class Main {

    /**
     * @Author trawberrylin
     * @Description Main entrance.
     * @Date 下午9:41 18-10-11
     * @Param [args]
     * @return void
     * update at 2018/10/27 01:23:23
     **/
    public static void main(String[] args) {
        System.out.println("Loading config file...");

        try {
            Hashtable<String, TestModule> testModules = TestModuleLoader.load("src/App_Config/module.xml");

            String unitName = "LinkList";
            TestBase t = (TestBase) ClassLoader.getSystemClassLoader().loadClass(testModules.get(unitName).getTestClass()).newInstance();
            t.baseTest();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Load config file exception!");
        }
    }
}
