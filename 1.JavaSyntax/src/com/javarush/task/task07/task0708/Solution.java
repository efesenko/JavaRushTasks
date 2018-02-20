package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Solution.strings = new ArrayList<>();

        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

//ввод строк с клавиатуры
        for (int i = 0; i < 5; i++)
        {
            String s = reader.readLine();
            strings.add(s);
        }
        //ArrayList<String> longestItems = new ArrayList<String>();
        String longestString = "";

        for (int i = 0; i < 5; i++)
        {
            if(strings.get(i).length() > longestString.length()) longestString = strings.get(i);

        }

        for (int i = 0; i < 5; i++)
        {
            if(longestString.length()==strings.get(i).length()) System.out.println(strings.get(i));
        }

    }
}
