package com.komangss.array;


public class Array {
    private int[] arr;
    private int count;
    
    public Array(int size) {
      arr = new int[size];
      count = 0;
    }
    
    public void insert(int value) {
       if(count == arr.length) {
         int[] newArr = new int[count*2];
         for(int i = 0; i < count; i++)
           newArr[i] = arr[i];
         arr = newArr;
       }
       arr[count++] = value;
    }
    
    public void print() {
      for (int i = 0; i < count; i++){
        System.out.println(arr[i]);
      }
    }
    
    public void removeAt(int index) {
      if(index < 0 || index >= count)
      throw new IllegalArgumentException();
      
      for(int i = index; i < count; i++) 
        arr[i] = arr[i+1];
      
      count--;
    }
    
    public int getIndexOf(int value) {
      for(int i = 0; i < count; i++) {
        if(arr[i] == value) return i;
      }
      return -1;
    }
}