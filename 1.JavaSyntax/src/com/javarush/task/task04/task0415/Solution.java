package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a, b, c;


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        a = Integer.parseInt(s);

        s = bufferedReader.readLine();
        b = Integer.parseInt(s);

        s = bufferedReader.readLine();
        c = Integer.parseInt(s);

        if(a > 0 && b > 0 && c > 0){
            if ( ((a+b) > c) && ((a+c) > b) && ((c+b) > a)) {
                System.out.println("Треугольник существует.");
            }
            else
            System.out.print("Треугольник не существует.");
        }
        else {
            System.out.print("Треугольник не существует.");
        }

    }
}