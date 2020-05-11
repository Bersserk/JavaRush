package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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

        // считываем пять строк и сразу записываем в массив
        for (int i = 0; i < 5; i++) {
            String text = in.readLine();
            list.add(text);
        }

        // сортируем массив по возрастанию методом пузырька
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if ((list.get(j)).length() > (list.get(j + 1)).length()) {
                    String str = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, str);
                }
            }
        }

        // пробегаем по сортированному массиву, выводя на экран первый элемент и каждый последующий, если он равен предыдущему
        int j = 0;

        do {
            System.out.println(list.get(j));
            j++;
            if (j == 5)
                break;
        } while ((list.get(j - 1)).length() == (list.get(j)).length());
    }
}