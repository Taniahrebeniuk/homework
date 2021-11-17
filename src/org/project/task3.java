package org.project;

public class task3 {
    public static void main(String[] args) {
       int [] arr = new int [] {99, 4,65,32,8};
       int min = arr[0];
       for (int i = 0; i < arr.length; i++) {
           if(arr[i] < min)
               min = arr[i];
       }
    System.out.println("Minimum value in an array is: "  +  min);

    }
}
