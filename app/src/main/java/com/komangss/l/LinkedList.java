package com.komangss.linkedlist;

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
    
    public void addLast(int x) {
      Node n = new Node(x);
      if (isEmpty()) {
        first = last = n;
      } else {
        last.next = n;
        System.out.println("F " + first.next+ "v " + first.next.value);
        if(x == 40) System.out.println(first.next.next.value);
        System.out.println("L " + last.next + "v " + last.next.value);
        last = n;
      }
    }
    
    public void addFirst(int x) {
      Node n = new Node(x);
      if(isEmpty()) {
        first = last = n;
      } else {
        n.next = first;
        first = n;
      }
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
}
