package me.wlins.testunit;

import me.wlins.base.TestBase;
import me.wlins.entity.Queue;

/**
 * @ClassName QueueTest
 * @Description TODO
 * @Author strawberrylin
 * @Date 18-10-31 下午10:15
 * @Version 1.0
 **/
public class QueueTest implements TestBase{
    @Override
    public void baseTest() {
        Queue<Integer> queue = new Queue<>();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        System.out.println(queue.size());
        while (!queue.isEmpty()){
            System.out.println(queue.deQueue());
        }
    }

    @Override
    public void deepTest() {

    }
}
