package com.javatpoint.springbootexample;
 
class LinkedListNode{
    int data;
    LinkedListNode next;
 
    LinkedListNode(int data){
        this.data = data;
    }
 
}
 
public class LinkedList {
 
    private LinkedListNode addElementAtFront(LinkedListNode head, int val){
        LinkedListNode newNode = new LinkedListNode(val);
        newNode.next = head;
        head = newNode;
        return newNode;
    }
 
    private LinkedListNode addElementAtEnd(LinkedListNode head, int val){
        LinkedListNode dummyNode = new LinkedListNode(-1);
        dummyNode.next = head;
 
        LinkedListNode current = dummyNode;
 
        while(current.next != null)
            current = current.next;
 
        current.next = new LinkedListNode(val);
        return dummyNode.next;
    }
 
    private LinkedListNode addElementInBetweenNodes(LinkedListNode head, LinkedListNode n1, LinkedListNode n2, int val){
        LinkedListNode newNode = new LinkedListNode(val);
        n1.next = newNode;
        newNode.next = n2;
        return head;
    }
 
    private LinkedListNode addElementAfterANode(LinkedListNode head, LinkedListNode n1, int val){
        LinkedListNode newNode = new LinkedListNode(val);
        LinkedListNode tempNode = n1.next;
        n1.next = newNode;
        newNode.next = tempNode;
        return head;
    }
 
    private LinkedListNode deleteNodeFromFront(LinkedListNode head){
 
        if(head == null)
            return head;
 
        head = head.next;
        return head;
    }
 
    private LinkedListNode deleteNodeFromEnd(LinkedListNode head){
 
        if(head == null)
            return head;
 
        LinkedListNode dummyNode = new LinkedListNode(-1);
        dummyNode.next = head;
 
        LinkedListNode prev = dummyNode;
        LinkedListNode current = head;
 
        while(current.next != null){
            prev = current;
            current = current.next;
        }
 
        prev.next = current.next;
        return dummyNode.next;
    }
 
    private LinkedListNode deleteNodeAtSpecificPosition(LinkedListNode head, int position){
        LinkedListNode dummyNode = new LinkedListNode(-1);
        dummyNode.next = head;
 
        LinkedListNode current = head;
        LinkedListNode prev = dummyNode;
        int traversedNodes = 0;
 
        while(traversedNodes != position){
            prev = current;
            current = current.next;
            traversedNodes += 1;
        }
 
        prev.next = current.next;
        return dummyNode.next;
 
//        while(traversedNodes < position-1){
//            current = current.next;
//            traversedNodes += 1;
//        }
//
//        current.next = current.next.next;
//        return head;
    }
 
}