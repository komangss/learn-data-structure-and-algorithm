package com.komangss.linkedlist;

import java.util.NoSuchElementException;


public class LinkedList {

    private class Node {
        private int value;
        private Node next;
        public Node(int v) {
          value = v;
        }
    }

    private Node first;
    private Node last;
    private int size;
    
    public void addLast(int x) {
      Node n = new Node(x);
      if (isEmpty()) {
        first = last = n;
      } else {
        last.next = n;
        last = n;
      }
      size++;
    }
    
    public void addFirst(int x) {
      Node n = new Node(x);
      if(isEmpty()) {
        first = last = n;
      } else {
        n.next = first;
        first = n;
      }
      size++;
    }
    
    public boolean isEmpty() {
      return first == null;
    }
    
    public int indexOf(int item) {
      if(item < 0) throw new IllegalArgumentException();
      
      int index = 0;
      Node curr = first;
      while(curr != null) {
        if(curr.value == item ) return index;
        curr = curr.next;
        index++;
      }
      return -1;
    }
    
    // Practice 1 : Print middle element of linked list
    public void printMiddle() {
    // use 2 pointer, one is to check the end and one is on the middle
        Node next = first;
        Node curr = first;
        while (next != null && next.next != null) {
          curr = curr.next;
          next = next.next.next;
        }
        System.out.println(curr.value);
    }
    
    public int size() {
      if (isEmpty())
         throw new NoSuchElementException();
         
      return size;
    }
    
    public void removeFirst() {
      if(isEmpty())
        throw new NoSuchElementException();
        
      // Warning = can cause memory leak
      // first = first.next;
      
      Node temp = first.next;
      first.next = null;
      first = temp;
      
      size--;
    }
    
    public void removeLast() {
      if (first == last) {
        first = last = null;
        return;
      }
      
      Node prevLast = getPrevious(last);
      last = prevLast;
      last.next = null;
    }
    private Node getPrevious(Node x) {
      Node temp = first;
      while (temp.next != x) {
        temp = temp.next;
      }
      return temp;
    }
}
