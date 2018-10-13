package me.wlins.entity;

/**
 * @ClassName LinkListNode
 * @Description To describe the node of a linklist.
 * @Author strawberrylin
 * @Date 18-10-11 下午10:08
 * @Version 1.0
 **/
public class LinkListNode {
    private int data;
    private LinkListNode next;

    public LinkListNode() {
    }

    public LinkListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public LinkListNode getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(LinkListNode next) {
        this.next = next;
    }
}
