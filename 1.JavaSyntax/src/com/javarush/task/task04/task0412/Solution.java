package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a;
        //System.out.println("Plz enter a");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        a = Integer.parseInt(s);

       // System.out.println(a);

        if (a<0) a=(a+1);

        if (a>0) a=(a*2);


        System.out.println(a);

    }

}