package me.wlins.testunit;

import me.wlins.base.TestBase;
import me.wlins.entity.Bag;

/**
 * @ClassName BagTest
 * @Description TODO
 * @Author strawberrylin
 * @Date 18-10-30 下午9:37
 * @Version 1.0
 **/
public class BagTest implements TestBase{
    @Override
    public void baseTest() {
        Bag<Integer> bag  = new Bag<>();
        bag.add(0);
        bag.add(4);
        bag.add(5);
        bag.add(9);

        bag.print();
    }

    @Override
    public void deepTest() {

    }
}
