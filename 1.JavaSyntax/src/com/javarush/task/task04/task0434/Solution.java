package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a = 1;
        int b = 1;
        int i = 0;
        int j=0;
        while (a<11){
            b=1;
            while (b<11){
                System.out.print(a*b);
                System.out.print(" ");
                b++;
            }
            System.out.println();
            a++;

        }

    }
}
