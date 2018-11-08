package com.examples.linkedlist;


import org.junit.Test;

/**
 * @author zhangmengc
 * @date 2018/11/8 18:07
 * @since v1.0.0
 */
public class MyLinkedListTest {


    @Test
    public void test(){
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
        linkedList.get(1);            //返回2
        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        linkedList.get(1);            //返回3
    }

}