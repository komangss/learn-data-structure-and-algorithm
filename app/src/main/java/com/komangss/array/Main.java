package com.komangss.array;


public class Main {
  public static void main(String[] args) {
   Array array = new Array(1);
   array.insert(6);
   array.insert(10);
   array.insert(19);
   array.removeAt(1);
   System.out.println("Index of 6 : " + array.getIndexOf(6));
   array.print();
  }
}
