package me.wlins.entity;

/**
 * @ClassName LinkList
 * @Description To realize the linklist.
 * @Author strawberrylin
 * @Date 18-10-11 下午10:10
 * @Version 1.0
 **/
public class LinkList {
    private LinkListNode head;
    private LinkListNode tail;
    private int length;

    public LinkList() {
        head = new LinkListNode();
        tail = head;
        length = 0;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void addNode(LinkListNode node) {
        tail.setNext(node);
        tail = tail.getNext();
        length ++;
    }

    public void insertNodeByIndex(int index, LinkListNode node){
        if(index < 1 || index > this.length+1){
            System.out.println("插入位置不合理");
            return;
        }

        LinkListNode temp = head;
        for(int i=1;i <= length+1; i ++){
            if(index==i){
                 node.setNext(temp.getNext());
                 temp.setNext(node);
                 length ++;
                 return;
            }
            temp=temp.getNext();
        }
    }

    public void deleteNodeByIndex(int index) {
        if(index < 1 || index > length){
            System.out.println("输入的位置不合理");
            return;
        }

        LinkListNode temp = head;
        for(int i=1; i <= length;i ++){
            if(index==i){
                temp.setNext(temp.getNext().getNext());
                length --;
                return;
            }
            temp = temp.getNext();
        }
    }

    public void print() {
        LinkListNode temp = head.getNext();
        StringBuilder sb = new StringBuilder("[");

        while(temp.getNext() != null) {
            sb.append(temp.getData());
            sb.append(",");
            temp=temp.getNext();
        }
        sb.append(temp.getData());
        sb.append("]");
        System.out.println(sb);
    }
}
