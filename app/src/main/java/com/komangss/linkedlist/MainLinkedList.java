package com.komangss.linkedlist;

import com.komangss.linkedlist.LinkedList;

public class MainLinkedList {

  public static void main(String[] args) {
     LinkedList ll = new LinkedList();
     ll.addLast(20);
     ll.addLast(30);
     ll.addLast(40);
     ll.addLast(50);
     ll.addFirst(60);
     ll.addFirst(70);
     
     System.out.println(ll.indexOf(70));
  }

}
,