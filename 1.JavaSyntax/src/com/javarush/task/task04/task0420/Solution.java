package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        s = bufferedReader.readLine();
        int c = Integer.parseInt(s);

        int max = a;

        if (max < b ) max = b;
        if (max < c ) max = c;

        int mid = a;
        if ((a > b && a < c)||(a < b && a > c)) mid = a;
        else if ((b > a && b < c)||(b < a && b > c)) mid = b;
        else if ((c > a && c < b)||(c < a && c > b)) mid = c;

        int min = a;

        if (min > b ) min = b;
        if (min > c ) min = c;

        System.out.println(max+ " "+mid+" "+min);


    }

}


