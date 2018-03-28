package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int maximum = -2147483648;
        int n;

        if (N > 0) {
            for (int i = 1; i <= N; i++) {
                n = Integer.parseInt(reader.readLine());
                maximum = (maximum > n ? maximum : n);
            }

            //напишите тут ваш код

            System.out.println(maximum);
        }
    }
}

