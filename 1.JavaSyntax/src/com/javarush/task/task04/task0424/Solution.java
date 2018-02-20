package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        int a = Integer.parseInt(s);

        s= bufferedReader.readLine();
        int b = Integer.parseInt(s);

        s= bufferedReader.readLine();
        int c = Integer.parseInt(s);

        if ((a==b)&&(c!=b)) System.out.println(3);
        if ((c==b)&&(b!=a)) System.out.println(1);
        if ((a==c)&&(c!=b)) System.out.println(2);
    }
}
