package me.wlins.entity;

/**
 * @ClassName Queue
 * @Description A test of abstract data sructure.
 * @Author strawberrylin
 * @Date 18-10-31 下午10:09
 * @Version 1.0
 **/
public class Queue<T> {
    private LinkList<T> queueLinkList;

    public Queue(){
        this.queueLinkList = new LinkList<T>();
    }

    public void enQueue(T data){
        queueLinkList.insert(data);
    }

    public T deQueue(){
        return queueLinkList.deleteNodeByIndex(1);
    }

    public boolean isEmpty(){
        return queueLinkList.getLength() == 0;
    }

    public int size(){
        return queueLinkList.getLength();
    }
}
