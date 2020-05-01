// package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;                                                                                                   
                                                                                                    
/*                                                                                                     
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код                                                    
        ArrayList<String> list = new ArrayList<>();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int tmp = 100;
        String minText = null;
        String minText2 = null;

        for (int i = 0; i < 5; i++) {
            String text = in.readLine();
            list.add(text);
        }

        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length - 1 - i; j++){
                if(list[j].length() > list[j + 1].length()){
                    String str = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = str;
                }
            }
        }

//вывод массива
        for(String s : list){
            System.out.println(s);
        }
    }
}