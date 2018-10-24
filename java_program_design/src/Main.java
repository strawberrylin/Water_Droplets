/**
 * @ClassName Main
 * @Description The Entrance of the program.
 * @Author strawberrylin
 * @Date 18-10-11 下午9:40
 * @Version 1.0
 **/

import me.wlins.entity.TestModule;
import me.wlins.util.TestModuleLoader;

import java.util.Hashtable;

public class Main {

    /**
     * @Author trawberrylin
     * @Description Main entrance.
     * @Date 下午9:41 18-10-11
     * @Param [args]
     * @return void
     * update at 2018/10/24 23:23:23
     **/
    public static void main(String[] args){
        System.out.println("Loading config file...");

        try{
            Hashtable<String, TestModule> testModules = TestModuleLoader.load("src/App_Config/module.xml");
            for(String key : testModules.keySet()){
                System.out.println(testModules.get(key));
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Load config file exception!");
        }

        /*String TestModule = "LinkList";

        switch(TestModule){
            case "LinkList" :
                LinkList linkList = new LinkList();

                for(int i = 1;i < 10;i ++) {
                    LinkListNode node = new LinkListNode(i);
                    linkList.addNode(node);
                }


                linkList.print();

                // 在指定位置插入元素
                LinkListNode insertNode1 = new LinkListNode(0);
                linkList.insertNodeByIndex(1, insertNode1);

                LinkListNode insertNode2 = new LinkListNode(0);
                linkList.insertNodeByIndex(linkList.getLength(), insertNode2);

                LinkListNode insertNode3 = new LinkListNode(0);
                linkList.insertNodeByIndex(linkList.getLength()+1, insertNode3);

                linkList.print();

                //　删除指定位置元素
                linkList.deleteNodeByIndex(1);
                linkList.deleteNodeByIndex(9);

                linkList.print();
                break;

            case "Test" :
                break;

            default:
                System.out.println("Hello World!");
                break;
        }*/
    }
}
