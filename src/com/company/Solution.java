package com.company;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
import java.io.BufferedReader;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
import java.io.InputStreamReader;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
import java.util.*;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
public class Solution {

    static boolean r = false;
    static boolean l = false;

    public static void main(String[] args) {                                                  
        ArrayList<String> strings = new ArrayList<String>();                                                  
        strings.add("роза");
        strings.add("лоза");                                                  
        strings.add("лира");
        strings.add("река");
        strings.add("лара");
        strings.add("лена");

        strings = fix(strings);                                                  
                                                  
        for (String string : strings) {                                                  
            System.out.println(string);                                                  
        }                                                  
    }                                                  
                                                  
    public static ArrayList<String> fix (ArrayList<String> strings) {
        ArrayList<String> tmp = new ArrayList<String>();
        //напишите ту:т ваш код
        for (int i = 0; i < strings.size(); i++ ) {

            r = false;
            l = false;

            charset (strings.get(i));

            if (r == true & l == false){

            } else if (r == false & l == true){
                tmp.add(strings.get(i));
                tmp.add(strings.get(i));
            } else {
                tmp.add(strings.get(i));
            }
        }
        return tmp;
    }

    public static void charset (String s){
        char[] charArray = s.toCharArray();

        for (int y = 0; y < charArray.length; y++){
            if (charArray[y] == 'р'){
                r = true;
            } else if (charArray[y] == 'л'){
                l = true;
            }
        }
    }
}                                                             
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
