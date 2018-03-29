package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));

        String s;

        int sum=0;
        int a;

        s = reader.readLine();
        a = Integer.parseInt(s);
        sum +=a;

        while (a!=-1){

                s = reader.readLine();
                a = Integer.parseInt(s);
                sum +=a;
        }

        System.out.println(sum);

    }
}
