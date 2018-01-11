package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a, b, c;
        String s;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        s = bufferedReader.readLine();
        a = Integer.parseInt(s);

        s = bufferedReader.readLine();
        b = Integer.parseInt(s);

        s = bufferedReader.readLine();
        c = Integer.parseInt(s);

        if (a == b && b!= c) System.out.println(a + " " + b);

        if (a == c && c!= b) System.out.println(a + " " + c);

        if (b == c && c!= a) System.out.println(b + " " + c);

        if (c == b && b == a) System.out.println(a + " " + b + " " +c);
    }
}