package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

//ввод строк с клавиатуры
        for (int i = 0; i < 5; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }
        String temp = "";

        for(int i = 1; i<=13; i++){
            temp = list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0,temp);
        }

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }


    }
}
