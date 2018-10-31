package me.wlins.testunit;

import me.wlins.base.TestBase;
import me.wlins.entity.Stack;

/**
 * @ClassName StackTest
 * @Description TODO
 * @Author strawberrylin
 * @Date 18-10-30 下午10:26
 * @Version 1.0
 **/
public class StackTest implements TestBase{
    @Override
    public void baseTest() {
        Stack<Character> stack = new Stack<>();
        stack.push('A');
        stack.push('B');
        stack.push('C');
        stack.push('D');

        while (stack.size() != 0){
            char c = stack.pop();
            System.out.println(c);
        }
    }

    @Override
    public void deepTest() {

    }
}
