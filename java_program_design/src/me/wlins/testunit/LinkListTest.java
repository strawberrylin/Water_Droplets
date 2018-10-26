package me.wlins.testunit;

import me.wlins.entity.LinkList;
import me.wlins.entity.LinkListNode;
import me.wlins.base.TestBase;

/**
 * @ClassName LinkListTest
 * @Description Description the test procedure of LinkList
 * @Author strawberrylin
 * @Date 18-10-27 上午1:05
 * @Version 1.0
 **/
public class LinkListTest implements TestBase{
    public void baseTest(){
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
    }

    public void deepTest(){}
}
