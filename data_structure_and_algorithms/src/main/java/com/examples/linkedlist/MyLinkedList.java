
package com.examples.linkedlist;

/**
 * @author zhangmengc
 * @date 2018/11/8 18:01
 * @since v1.0.0
 */
public class MyLinkedList {

    int size;

    Node head;

    Node tail;

    private static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    /** Initialize your data structure here. */
    public MyLinkedList() {

    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index > 0 && index < size ){
            int i = 0;
            Node p = head;
            while ((p = p.next) != null) {
                if (i == index) {
                    return p.val;
                }
                i++;
            }
        }
        return -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {

    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (head == null) {

        }
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {

    }

}
