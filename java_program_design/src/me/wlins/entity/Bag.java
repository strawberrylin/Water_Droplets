package me.wlins.entity;

import java.util.Iterator;

/**
 * @ClassName Bag
 * @Description An test of abstract data structure: Bag.
 * @Author strawberrylin
 * @Date 18-10-27 下午11:22
 * @Version 1.0
 **/
public class Bag<T> implements Iterable<T> {
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private LinkList<T> bagLinkList;

    public Bag(){
        this.bagLinkList = new LinkList<T>();
    }

    public void add(T data){
        this.bagLinkList.insert(data);
    }

    public void print(){
        this.bagLinkList.print();
    }
}
