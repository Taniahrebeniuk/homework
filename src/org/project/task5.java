package org.project;

public class task5 {
    public static void main(String[] args) {
      String value = "I learn Java";
      String reversedStr = "";

      for(int i=value.length()-1; i>=0; i--){
          reversedStr = reversedStr + value.charAt(i);

      }
      System.out.println("Original string: " + value);

      System.out.println("Reverse of given string: " + reversedStr);
    }
}
