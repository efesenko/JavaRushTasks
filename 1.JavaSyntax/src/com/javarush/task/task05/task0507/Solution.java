package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        double a = Double.parseDouble(s);
        double ave;
        int count = 0;
        double sum = 0;


        while (a != -1){
            count++;
            sum +=a;

            s = bufferedReader.readLine();
            a = Double.parseDouble(s);
        }

        if (count != 0) {
            ave = sum / count;
            System.out.println(ave);
        }



    }
}

