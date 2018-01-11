package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        int a = Integer.parseInt(s);

        s = bufferedReader.readLine();
        int b = Integer.parseInt(s);

        if (a > b) System.out.println(b);
        if (a < b) System.out.println(a);
        if (a == b) System.out.println(a);
    }
}