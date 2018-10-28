package me.wlins.entity;

/**
 * @ClassName LinkListNode
 * @Description To describe the node of a linklist.
 * @Author strawberrylin
 * @Date 18-10-11 下午10:08
 * @Version 1.1
 * Changed by strawberrylin at 2018/10/28
 **/
public class LinkListNode<T> {
    private T data;
    private LinkListNode next;

    public LinkListNode() {
    }

    public LinkListNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public LinkListNode getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(LinkListNode next) {
        this.next = next;
    }
}
