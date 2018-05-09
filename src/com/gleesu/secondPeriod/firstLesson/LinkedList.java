package com.sr.first;

import javafx.beans.binding.ObjectExpression;

/**
 * 1)使用静态内部类，存储节点
 *   如果不使用static，每创建一个LL对象，都会创建一个内部类
 *   需要使用static，和LL类同步
 * */
public class LinkedList {

    private Node head;

    public void add(Object o){
        if(null == head){
            head = new Node();
            head.next = null;
        }
    }

    public void add(int index, Object o){

    }

    public Object get(int index){
        return null;
    }

    public Object remove(int index){
        return null;
    }

    public int size(){
        return -1;
    }


    public void addFirst(Object o){

    }

    public void addLast(Object o){

    }

    public Object removeFirst(){
        return null;
    }
    public Object removeLast(){
        return null;
    }

    //静态内部类
    private static class Node{
        Object o;
        Node next;
        Node prev;
    }
}
