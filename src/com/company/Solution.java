package com.javarush.task.task07.task0709;                                                                                                                                                      
                                                                                                    
import java.io.BufferedReader;                                                                                                    
import java.io.InputStreamReader;                                                   
import java.io.IOException;                                                   
import java.util.*;                                                                                                   
                                                                                                    
/*                                                                                                     
Числа по возрастанию                                                                                                    
*/                                                                                                    
                                                                                                    
public class Solution {                                                   
                                                  
   public static void main(String[] args) throws Exception {                                                                                                                                                      
        //напишите тут ваш код                                                    
    ArrayList<String> list = new ArrayList<>();                                                  
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));                                                  
           int tmp = 100;                                                  
            String minText = null;                                                  
            String minText2 = null;                                                  
        for (int i = 0; i < 5; i++){                                                  
           String text = in.readLine();                                                  
            list.add(text);                                                  
           int textLength = text.length();                                                  
                                                             
            //System.out.println("textLength = " + textLength);                                                  
            //System.out.println("text = " + text);                                                  
                                                             
           if (textLength < tmp){                                                  
              //System.out.println("цикл if");                                                  
              tmp = textLength;                                                  
              minText = text;                                                  
           } else if (textLength == tmp){                                                  
                tmp = textLength;                                                  
                minText2 = text;                                                  
             }                                                  
                                                             
        }                                                    
                                                  
                                                             
                                                  
                                                  
          if (minText2 != null){                                                  
            System.out.println(minText);                                                  
            System.out.println(minText2);                                                   
             //System.out.println(list.get(0).length());                                                  
          //  System.out.println(list.get(1).length());                                                  
                                                              
         }else                                                   
           System.out.println(minText);                                                    
                                                             
                                                             
           /* System.out.println("1 элемент = " + list.get(0));                                                  
            System.out.println("2 элемент = " + list.get(1));                                                  
             System.out.println("3 элемент = " +list.get(2));                                                  
            System.out.println("4 элемент = " +list.get(3));                                                  
           System.out.println("5 элемент = " +list.get(4));                                                  
           */                                                                                           
    }                                                                                                    
}                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
