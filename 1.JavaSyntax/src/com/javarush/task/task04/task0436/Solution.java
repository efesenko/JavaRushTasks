package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
        String s = reader.readLine();
        int m = Integer.parseInt(s);

        s = reader.readLine();
        int n = Integer.parseInt(s);
        for (int j=0;j<m;j++){

            for(int i=0; i<n; i++) System.out.print(8);
            System.out.println();
        }

    }
}
