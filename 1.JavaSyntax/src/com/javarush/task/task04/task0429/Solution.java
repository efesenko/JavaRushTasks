package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int countMinus = 0;
        int countPlus = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int a = Integer.parseInt(s);

        s = bufferedReader.readLine();
        int b = Integer.parseInt(s);

        s = bufferedReader.readLine();
        int c = Integer.parseInt(s);

        if (a>0) countPlus++;
        else if (a<0) countMinus++;

        if (b > 0) countPlus++;
        else if (b < 0) countMinus++;

        if (c > 0) countPlus++;
        else if (c < 0) countMinus++;

        System.out.println("количество отрицательных чисел: " +countMinus);
        System.out.println("количество положительных чисел: " +countPlus);

    }
}
