package me.wlins.entity;

import java.util.Iterator;

/**
 * @ClassName Stack
 * @Description A test of abstract data structure: Satck.
 * @Author strawberrylin
 * @Date 18-10-30 下午10:09
 * @Version 1.0
 **/
public class Stack<T> {
    private LinkList<T> stackLinkList;

    public Stack() {
        this.stackLinkList = new LinkList<>();
    }

    public void push(T data) {
        this.stackLinkList.insert(data);
    }

    public T pop(){
        T data = this.stackLinkList.deleteNodeByIndex(this.stackLinkList.getLength());
        return data;
    }

    boolean isEmpty(){
        return this.stackLinkList.getLength()==0;
    }

    public int size(){
        return this.stackLinkList.getLength();
    }
}
