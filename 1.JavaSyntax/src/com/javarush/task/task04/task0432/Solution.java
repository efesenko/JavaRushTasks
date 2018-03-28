package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();
        int a = Integer.parseInt(s2);
        int i=1;

        while (i <= a) {
            System.out.println(s1);
            i++;
        }



    }
}
