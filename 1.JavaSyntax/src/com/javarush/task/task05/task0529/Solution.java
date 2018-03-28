package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        int sum = 0;
        int a;

        while (!s.equals("сумма")){
            a = Integer.parseInt(s);
            sum+=a;
            s = bufferedReader.readLine();
        }

        System.out.println(sum);
    }
    }
